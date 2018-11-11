
public class Task1_4 {
    public static void main(String[] args) {
        ReadInfo readInfo = new ReadInfo();
        Designer designer = new Designer();
        TeamDesigners teamDesigners = new TeamDesigners();

        Customer customer = new Customer();
        Manager manager = new Manager();
        View view = new View(readInfo);

        Controller controller = new Controller(customer, manager, view, designer, teamDesigners, readInfo);
        controller.start();
    }
}
