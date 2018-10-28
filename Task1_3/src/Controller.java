import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    private PatientModel pm;
    private PatientView pv;

    public Controller(PatientModel pm, PatientView pv) {
        this.pm = pm;
        this.pv = pv;
    }

    public void menu() throws FileNotFoundException, IllegalArgument {
        System.out.println("Choose one of menu");
        System.out.println("1)Enter Info\n2)Show All\n3)Show Diagnose\n4)Show In Range");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        switch (MenuEnum.valueOf(choice.trim())) {
            case ENTER_INFO:
                pm.enter();
                break;
            case SHOW_ALL:
                pv.readFromFile();
                break;
            case SHOW_DIAGNOSE:
                pv.ParseFile("test.txt", "Teeth");
                break;
            case SHOW_IN_RANGE:
                pv.readInRange(pm, 1, 3);
                break;
            default:
                throw new IllegalArgument("Error", 1);
        }
    }
}
