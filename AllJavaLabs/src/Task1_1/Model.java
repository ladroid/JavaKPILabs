package Task1_1;

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

//        for(int i=0; i<m[row].length; i++)
//        {
//            if(m[row][i] < 0)
//            {
//                for(i=row+1; i < m.length && m[i][row]>=0; row++) {
//                    sum += m[i][row];
//                }
//                break;
//            }
//        }
        return sum;
    }
}
