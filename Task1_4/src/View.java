public class View {
    private ReadInfo readInfo;
    private Customer customer;
    private Manager manager;
    private Input input;
    private Task task;
    private Designer designer;
    private TeamDesigners teamDesigners;

    public View(ReadInfo readInfo, Customer customer, Manager manager, Input input, Task task, Designer designer, TeamDesigners teamDesigners) {
        this.readInfo = readInfo;
        this.customer = customer;
        this.manager = manager;
        this.input = input;
        this.task = task;
        this.designer = designer;
        this.teamDesigners = teamDesigners;
    }

    public void inputData() {
        input.inputCustomer(customer, task);
        input.inputManager(manager);
        input.inputDesigner(designer, customer, task, manager, teamDesigners);
    }

//    public void showInput() {
//        customer.enter();
//        manager.enterM();
//    }

    public void read(ReadInfo readInfo) {
        readInfo.readAll();
    }
    public void readS(ReadInfo readInfo) {
        System.out.println(readInfo.readAllS());
    }
}
