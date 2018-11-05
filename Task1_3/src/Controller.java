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

        Scanner input = new Scanner(System.in);
        switch (MenuEnum.valueOf(choice.trim())) {
            case ENTER_INFO:
                pm.enter();
                break;
            case SHOW_ALL:
                pv.readFromFile();
                break;
            case SHOW_DIAGNOSE:
                System.out.println("Enter diagnose");
                String diagnose = input.nextLine();
                pv.ParseFile("test.txt", diagnose);
                break;
            case SHOW_IN_RANGE:
                System.out.println("Enter range from to");
                int a = input.nextInt();
                int b = input.nextInt();
                pv.readInRange(pm, a, b);
                break;
            default:
                throw new IllegalArgument("Error", 1);
        }
    }
}
