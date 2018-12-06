package Task1_2;

import java.io.*;

public class ReadFile {
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
