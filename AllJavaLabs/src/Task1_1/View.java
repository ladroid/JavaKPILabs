package Task1_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * class View
 */
public class View {

    /**
     * model object
     */
    private Model model;

    /**
     * constructor takes value of model
     * @param model
     */
    public View(Model model) {
        this.model = model;
    }

    public void showArray(double[][] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                System.out.printf("%5s ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * shows the result
     */
    public void show(double[] res) {
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }

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
