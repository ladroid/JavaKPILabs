import java.util.Scanner;

public class Controller {
    private Customer customer;
    private Manager manager;
    private View view;
    private Designer designer;
    private TeamDesigners teamDesigners;
    private ReadInfo readInfo;

    public Controller(Customer customer, Manager manager, View view, Designer designer, TeamDesigners teamDesigners, ReadInfo readInfo) {
        this.customer = customer;
        this.manager = manager;
        this.view = view;
        this.designer = designer;
        this.teamDesigners = teamDesigners;
        this.readInfo = readInfo;
    }

    public void start() {
        System.out.println("=====================");
        System.out.println("=Building department=");
        System.out.println("=====================");
        System.out.println("Choose a choice");
        System.out.println("1)Enter\n2)Read");

        //view.inputData();

        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        switch (MenuEnum.valueOf(choice.trim())) {
            case Enter:
                view.inputData();
                break;
            case Read:
                view.readS(readInfo);
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
}
