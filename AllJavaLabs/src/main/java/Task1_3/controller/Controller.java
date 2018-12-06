package Task1_3.controller;

import Task1_3.exception.IllegalArgument;
import Task1_3.inputpatient.InputPatient;
import Task1_3.menuenum.MenuEnum;
import Task1_3.model.Model;
import Task1_3.read.ReadInfoChoice;
import Task1_3.read.ReadInformation;
import Task1_3.view.PatientView;
import Task1_3.view.ViewMenu;
import Task1_3.writeserializableclass.WriteSerializableClass;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private PatientView pv;
    private ReadInfoChoice readInfoChoice;
    private InputPatient inputPatient;
    //private WriteSerializableClass writeSerializableClass;
    private transient ViewMenu viewMenu;
    private Model model;
    private ReadInformation readInformation;
    private final transient Logger logger = Logger.getLogger(Controller.class);

    public Controller() {
        this.readInfoChoice = new ReadInfoChoice();
        this.inputPatient = new InputPatient();
        this.readInformation = new ReadInformation();
        this.pv = new PatientView(inputPatient, readInformation);
        //this.writeSerializableClass = new WriteSerializableClass();
        this.viewMenu = new ViewMenu();
        this.model = new Model(inputPatient, pv);
    }

    public void menu() throws FileNotFoundException, InterruptedException {
        logger.debug(viewMenu.debugLog("Start controller"));
        viewMenu.print("Choose one of menu");
        viewMenu.print("1)ENTER_INFO\n2)READ_INFO\n3)SERIALIZABLEW");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        try {
            switch (MenuEnum.valueOf(choice.trim())) {
                case ENTER_INFO:
                    pv.input();
                    model.writeToFile();
                    break;
                case READ_INFO:
                    pv.read(readInfoChoice);
                case SERIALIZABLEW:
                    model.writeSerializable();
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch (IllegalArgumentException iae) {
            //viewMenu.errorMsg("Incorreect choice. Please try again");
            //viewMenu.errorMsg();
            logger.error(viewMenu.errorMsg());
            Thread.sleep(1000);
            viewMenu.print("Wait...");
            Thread.sleep(10000);
            menu();
        }
    }
}

