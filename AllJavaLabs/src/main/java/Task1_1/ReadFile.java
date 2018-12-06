package Task1_1;

import Task1_2.StringWorkModel;

import java.io.*;

public class ReadFile {
    public void readResult(Model model) {
        model.writeToFile();
        String result;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("task11.txt"))) {
            while((result = bufferedReader.readLine()) != null) {
                System.out.println(result);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
