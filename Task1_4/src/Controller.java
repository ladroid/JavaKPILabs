import java.util.Scanner;

public class Controller {
    private Customer customer;
    private Manager manager;
    private View view;
    private Designer designer;
    private TeamDesigners teamDesigners;

    public Controller(Customer customer, Manager manager, View view, Designer designer, TeamDesigners teamDesigners) {
        this.customer = customer;
        this.manager = manager;
        this.view = view;
        this.designer = designer;
        this.teamDesigners = teamDesigners;
    }

    public void start() {
        System.out.println("=====================");
        System.out.println("=Building department=");
        System.out.println("=====================");
        System.out.println("Choose a choice");
        System.out.println("1)Customer\n2)Manager\n3)View");

        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        switch (MenuEnum.valueOf(choice.trim())) {
            case Customer:
                customer.enter();
                start();
            case Manager:
                manager.enterM();
                manager.rewriteFile(customer, designer, teamDesigners);
                break;
            case View:
                view.readAll();
                break;
            default:
                System.out.println("Error!!!");
                break;
        }
    }
}
