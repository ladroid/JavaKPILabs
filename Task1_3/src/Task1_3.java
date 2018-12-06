import java.io.FileNotFoundException;

public class Task1_3 {
    public static void main(String[] args) throws FileNotFoundException {
        InputPatient inputPatient = new InputPatient();
        ReadInformation readInformation = new ReadInformation();
        PatientModel pm = new PatientModel();
        PatientView pv = new PatientView(readInformation);
        ReadInfoChoice readInfoChoice = new ReadInfoChoice();

        Controller c = new Controller(pm, pv, readInfoChoice, inputPatient);
        try {
            c.menu();
        } catch (IllegalArgument illegalArgument) {
            illegalArgument.toString();
        }
    }
}
