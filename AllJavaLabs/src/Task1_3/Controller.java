package Task1_3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    private PatientView pv;
    private ReadInfoChoice readInfoChoice;
    private InputPatient inputPatient;
    private WriteSerializableClass writeSerializableClass;

    public Controller(PatientView pv, ReadInfoChoice readInfoChoice, InputPatient inputPatient, WriteSerializableClass writeSerializableClass) {
        this.pv = pv;
        this.readInfoChoice = readInfoChoice;
        this.inputPatient = inputPatient;
        this.writeSerializableClass = writeSerializableClass;
    }

    public void menu() throws FileNotFoundException {
        System.out.println("Choose one of menu");
        System.out.println("1)ENTER_INFO\n2)READ_INFO\n3)SERIALIZABLEW");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        try {
            switch (MenuEnum.valueOf(choice.trim())) {
                case ENTER_INFO:
                    pv.enterInfo(inputPatient);
                    break;
                case READ_INFO:
                    pv.read(readInfoChoice);
                case SERIALIZABLEW:
                    writeSerializableClass.writeToFileObject();
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch(IllegalArgumentException iae) {
            throw new IllegalArgument("Error", 1);
        }
    }
}
