package Task1_2;

public class StringWorkController {
    private StringWorkModel stringWorkModel;
    private StringWorkView stringWorkView;

    public StringWorkController(StringWorkModel stringWorkModel, StringWorkView stringWorkView) {
        this.stringWorkModel = stringWorkModel;
        this.stringWorkView = stringWorkView;
    }

    public void run() {
        stringWorkView.view(stringWorkModel);
    }

    public void start() {
        stringWorkView.viewFromFile(stringWorkModel);
    }
}
