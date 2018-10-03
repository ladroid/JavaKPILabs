/**
 * Class model of array
 */
public class Model {

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

    /**
     * negSum() function which find sum of elements from array between first negative number and second
     * @param a should include array
     * @return sum returns the sum of the items found
     */
    static double negSum(double[] a)
    {
        double sum = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] < 0)
            {
                for(int j=i+1; j<a.length && a[j]>=0; j++) {
                    sum += a[j];
                }
                break;
            }
        }
        return sum;
    }
}
