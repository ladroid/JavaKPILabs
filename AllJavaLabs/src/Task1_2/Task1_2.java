package Task1_2;

public class Task1_2 {
    public static void main(String[] args) {
        StringWorkModel stringWorkModel = new StringWorkModel();
        StringWorkView stringWorkView = new StringWorkView();
        StringWorkController stringWorkController = new StringWorkController(stringWorkModel, stringWorkView);

        stringWorkController.start1();
    }
}
