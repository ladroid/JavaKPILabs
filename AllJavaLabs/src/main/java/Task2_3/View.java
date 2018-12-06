package Task2_3;

public class View {
    private Model model;
    public View() {
        this.model = new Model();
    }

    public void print(String msg) {
        System.out.println(msg);
    }

    public void show(Double summ) {
        System.out.println(summ);
    }
}
