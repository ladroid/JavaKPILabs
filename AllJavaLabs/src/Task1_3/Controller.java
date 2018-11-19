package Task1_3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    private PatientView pv;
    private ReadInfoChoice readInfoChoice;
    private InputPatient inputPatient;

    public Controller(PatientView pv, ReadInfoChoice readInfoChoice, InputPatient inputPatient) {
        this.pv = pv;
        this.readInfoChoice = readInfoChoice;
        this.inputPatient = inputPatient;
    }

    public void menu() throws FileNotFoundException {
        System.out.println("Choose one of menu");
        System.out.println("1)ENTER_INFO\n2)READ_INFO");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        try {
            switch (MenuEnum.valueOf(choice.trim())) {
                case ENTER_INFO:
                    pv.enterInfo(inputPatient);
                    break;
                case READ_INFO:
                    pv.read(readInfoChoice);
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch(IllegalArgumentException iae) {
            throw new IllegalArgument("Error", 1);
        }
    }
}
