public class View {
    private ReadInfo readInfo;
    private Customer customer;
    private Manager manager;

    public View(ReadInfo readInfo, Customer customer, Manager manager) {
        this.readInfo = readInfo;
        this.customer = customer;
        this.manager = manager;
    }

    public void showInput() {
        customer.enter();
        manager.enterM();
    }

    public void read(ReadInfo readInfo) {
        readInfo.readAll();
    }
}
