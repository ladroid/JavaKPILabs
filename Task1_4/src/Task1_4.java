
public class Task1_4 {
    public static void main(String[] args) {
        Designer designer = new Designer();
        TeamDesigners teamDesigners = new TeamDesigners();

        Customer customer = new Customer();
        //customer.writeToFile();

        Manager manager = new Manager();
        //manager.rewriteFile(customer, designer, teamDesigners);

        View view = new View();
        //view.readAll();
        Controller controller = new Controller(customer, manager, view, designer, teamDesigners);
        controller.start();
    }
}
