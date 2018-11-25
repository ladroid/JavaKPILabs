
public class Task1_4 {
    public static void main(String[] args) {
        ReadInfo readInfo = new ReadInfo();
        Designer designer = new Designer();
        TeamDesigners teamDesigners = new TeamDesigners();
        Input input = new Input();
        Task task = new Task();

        Customer customer = new Customer();
        Manager manager = new Manager();
        View view = new View(readInfo, customer, manager, input, task, designer, teamDesigners);

        Controller controller = new Controller(customer, manager, view, designer, teamDesigners, readInfo);
        controller.start();
    }
}
