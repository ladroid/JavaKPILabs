package Task1_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Class model of array
 */
public class Model implements Serializable {

    /**
     * array
     */
    private double[][] m;

    /**
     * Constructor Model
     * @param m should include array
     */
    public Model(double [][] m) {
        this.m = m;
    }

    /**
     * Getter of M
     * @return array
     */
    public double[][] getM() {
        return m;
    }

    public double[] a() {
        double []ex = new double[m.length];
        for(int i =0; i<m.length; i++) {
            ex[i] = negSum(i);
        }
        return ex;
    }

    /**
     * negSum() function which find sum of elements from array between first negative number and second
     * @return sum returns the sum of the items found
     */
    private double negSum(int row)
    {
        double sum = 0;
        double [] negSumArr = m[row];

        for(int i=0; i<negSumArr.length; i++) {
            if(negSumArr[i] < 0) {
                for(int j=i+1; j<negSumArr.length && negSumArr[j] >= 0; j++) {
                    sum += negSumArr[j];
                }
                break;
            }
        }

        return sum;
    }

    public void writeToFile() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("task11.txt", true))) {
            for(int i = 0; i < a().length; i++) {
                bufferedWriter.write(String.valueOf(a()[i]));
                bufferedWriter.newLine();

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(a());
    }
}
