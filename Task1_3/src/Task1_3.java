import java.io.FileNotFoundException;

public class Task1_3 {
    public static void main(String[] args) throws FileNotFoundException {
        PatientModel pm = new PatientModel();
        PatientView pv = new PatientView();

        Controller c = new Controller(pm, pv);
        try {
            c.menu();
        } catch (IllegalArgument illegalArgument) {
            illegalArgument.toString();
        }
    }
}
