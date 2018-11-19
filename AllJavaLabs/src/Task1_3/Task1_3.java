package Task1_3;

import java.io.FileNotFoundException;

public class Task1_3 {
    public static void main(String[] args) throws FileNotFoundException {
        InputPatient inputPatient = new InputPatient();
        ReadInformation readInformation = new ReadInformation();
        PatientView pv = new PatientView(readInformation);
        ReadInfoChoice readInfoChoice = new ReadInfoChoice();
        WriteSerializableClass writeSerializableClass = new WriteSerializableClass();

        Controller c = new Controller(pv, readInfoChoice, inputPatient, writeSerializableClass);

        c.menu();
    }
}
