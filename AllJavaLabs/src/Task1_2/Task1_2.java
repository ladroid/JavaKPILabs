package Task1_2;

public class Task1_2 {
    public static void main(String[] args) {
        StringWorkModel stringWorkModel = new StringWorkModel();
        StringWorkView stringWorkView = new StringWorkView();
        StringWorkController stringWorkController = new StringWorkController(stringWorkModel, stringWorkView);

        try {
            stringWorkController.start1();
        } catch (MyException me) {
            me.toString();
        }
    }
}
