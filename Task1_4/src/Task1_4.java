import controller.Controller;
import model.Model;
import people.customer.Customer;
import people.designer.Designer;
import people.manager.Manager;
import people.teamdesigners.TeamDesigners;
import tasks.Task;
import view.Input;
import view.ReadInfo;
import view.View;

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

        Model model = new Model(customer, task, manager, designer, teamDesigners);

        Controller controller = new Controller(model, customer, task, manager, view, designer, teamDesigners, readInfo);
        controller.start();
    }
}
