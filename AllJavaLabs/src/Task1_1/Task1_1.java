package Task1_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Lab 1
 *
 * @author  Kadjaia Lado
 * @version 1.0
 * @since   2018-09-26
 */

public class Task1_1 {

    /**
     * Making array in function makeArray()
     * @return array
     */
    public double[][] makeArray() throws MyException {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        double a[][] = new double[size][size];
        try {
            Random random = new Random();

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    a[i][j] = random.nextInt(30 + 1 + 10) - 10;
                }
            }
            throw new MyException("Error");
        } catch (MyException me) {
            me.toString();
        }
        return a;
    }

    public static void main(String[] args) throws MyException {
        Task1_1 task11 = new Task1_1();
        Model model = new Model(task11.makeArray());
        View view = new View(model);
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
