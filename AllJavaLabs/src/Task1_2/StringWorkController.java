package Task1_2;

import java.util.Scanner;

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

    public void start1() throws MyException {
        String str = "Hello, my name is Lado., I am from Ukraine., I born in Kiev., I think, that this is all.,";

        Scanner boges = new Scanner(System.in);
        System.out.println("Enter scanner for input from console or function for showing result");
        String answer = boges.nextLine();
        switch (Choice.valueOf(answer.trim())) {
            case SCANNER:
                StringWorkController swc = new StringWorkController(stringWorkModel, stringWorkView);
                swc.run();
                break;
            case FUNCTION:
                stringWorkModel = new StringWorkModel(str, ",");
                StringWorkController swc1 = new StringWorkController(stringWorkModel, stringWorkView);
                swc1.run();
                break;
            case FILE:
                swc = new StringWorkController(stringWorkModel, stringWorkView);
                swc.start();
                break;
            default:
                throw new MyException("Error", 1);
        }
    }
}
