package Task1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringWorkView {

    public void view(StringWorkModel stringWorkModel) {
        System.out.println("Before");
        System.out.println(stringWorkModel.gettingStrBefore());
        System.out.println("After");
        System.out.println(stringWorkModel.gettingStr());
    }

    public void viewFromFile(StringWorkModel stringWorkModel) {
        stringWorkModel.writeToFile();
        String result;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("task12.txt"))) {
            while((result = bufferedReader.readLine()) != null) {
                System.out.println(result);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
