package Task1_3.read;

import Task1_3.Task1_3;
import Task1_3.exception.IllegalArgument;
import Task1_3.menuenum.ReadMenuEnum;
import Task1_3.view.PatientView;
import Task1_3.view.ViewMenu;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInfoChoice {
    private ViewMenu viewMenu;
    private final transient Logger logger = Logger.getLogger(ReadInfoChoice.class);

    public ReadInfoChoice() {
        this.viewMenu = new ViewMenu();
    }

    public void readChoice(ReadInformation readInformation) throws FileNotFoundException, InterruptedException {
        logger.debug("Read choice");
        Scanner in = new Scanner(System.in);
        viewMenu.print("Choice for read\n1)ReadFromFile\n2)ReadInRange\n3)ReadDiagnose\n4)ReadObject");
        String choiceRead = in.nextLine();

        Scanner input = new Scanner(System.in);
        try {
            switch (ReadMenuEnum.valueOf(choiceRead.trim())) {
                case ReadFromFile:
                    System.out.println(readInformation.readFromFile());
                    break;
                case ReadInRange:
                    viewMenu.print("Enter range from to");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    System.out.println(readInformation.readInRange(a, b));
                    break;
                case ReadDiagnose:
                    viewMenu.print("Enter diagnose");
                    String diagnose = input.nextLine();
                    readInformation.parseFile("test.txt", diagnose);
                    break;
                case ReadObject:
                    PatientView patientView = (PatientView) readInformation.readObjectFromFile("task13_3.ser");
                    System.out.println(patientView);
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch(IllegalArgumentException iae) {
            //viewMenu.errorMsg("Incorreect choice. Please try again");
            logger.error(viewMenu.errorMsg());
        }
    }
}
