package Task1_2;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {

        String str = "Hello, my name is Lado., I am from Ukraine., I born in Kiev., I think, that this is all.,";

        Scanner boges = new Scanner(System.in);
        System.out.println("Enter scanner for input from console or function for showing result");
        String answer = boges.nextLine();

        switch (Choice.valueOf(answer.trim())) {
            case SCANNER:
                StringWorkModel swm = new StringWorkModel();
                StringWorkView swv = new StringWorkView();
                StringWorkController swc = new StringWorkController(swm, swv);
                swc.run();
                break;
            case FUNCTION:
                StringWorkModel swm1 = new StringWorkModel(str, ",");
                StringWorkView swv1 = new StringWorkView();
                StringWorkController swc1 = new StringWorkController(swm1, swv1);
                swc1.run();
                break;
            case FILE:
                StringWorkModel swm2 = new StringWorkModel();
                StringWorkView swv2 = new StringWorkView();
                StringWorkController swc2 = new StringWorkController(swm2, swv2);
                swc2.start();
                break;
            default:
                System.out.println("Error");
        }
    }
}
