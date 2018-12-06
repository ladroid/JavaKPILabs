package Task1_3.view;

import Task1_3.Task1_3;
import Task1_3.inputpatient.InputPatient;
import Task1_3.read.ReadInfoChoice;
import Task1_3.read.ReadInformation;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientView implements Serializable {
    private final transient Logger logger = Logger.getLogger(PatientView.class);
    private ReadInformation readInformation;
    private Integer Id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String Address;
    private Integer numberPhone;
    private Integer medicalCard;
    private String diagnose;
    private InputPatient inputPatient;
    private ViewMenu viewMenu;

    public PatientView(InputPatient inputPatient, ReadInformation readInformation) {
        this.inputPatient = inputPatient;
        this.readInformation = readInformation;
        this.viewMenu = new ViewMenu();
    }

    public void input() {
        try {
            logger.debug(viewMenu.debugLog("Start input data"));
            System.out.println("Enter number identification");
            Scanner input = new Scanner(System.in);
            Id = input.nextInt();
            inputPatient.setId(Id);

            Scanner inputS = new Scanner(System.in);
            System.out.println("Enter first Name");
            firstName = inputS.nextLine();
            inputPatient.setFirstName(firstName);

            System.out.println("Enter last Name");
            lastName = inputS.nextLine();
            inputPatient.setLastName(lastName);

            System.out.println("Enter patronymic");
            patronymic = inputS.nextLine();
            inputPatient.setPatronymic(patronymic);

            System.out.println("Enter address");
            Address = inputS.nextLine();
            inputPatient.setAddress(Address);

            System.out.println("Enter number phone");
            numberPhone = inputS.nextInt();
            inputPatient.setNumberPhone(numberPhone);

            System.out.println("Enter medical card");
            medicalCard = inputS.nextInt();
            inputPatient.setMedicalCard(medicalCard);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter diagnose");
            diagnose = sc.nextLine();
            inputPatient.setDiagnose(diagnose);
        } catch (InputMismatchException ime) {
            //viewMenu.errorInpt("Errro");
            logger.error(viewMenu.errorInpt());
        }
    }

//    public void enterInfo(InputPatient ipat) {
//        //ipat.input();
//        //pm.enter();
//    }

    public void read(ReadInfoChoice readInfoChoice) throws FileNotFoundException, InterruptedException {
        readInfoChoice.readChoice(readInformation);
    }

    @Override
    public String toString() {
        return Id + " " + firstName + " " + lastName + " " + patronymic + " " + Address + " "
                + numberPhone + " " + medicalCard + " " + diagnose;
    }
}