package Task2_3;

public class Controller {
    private Model model;
    private View view;
    private Task2_3 task23;

    public Controller() {
        this.model = new Model();
        this.view = new View();
        this.task23 = new Task2_3();
    }

    public void run() throws InterruptedException {
        view.print("Start calculating...");
        Thread.sleep(1000);
        view.print("Please, enter size");
        view.show(model.sumMin(task23.setMaker()));
    }
}
