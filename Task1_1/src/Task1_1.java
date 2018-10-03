import java.util.Random;

/**
 * Lab 1
 *
 * @author  Kadjaia Lado
 * @version 1.0
 * @since   2018-01-26
 */

public class Task1_1 {

    /**
     * Making array in function makeArray()
     * @param size take value of int.
     *             And this is a size of two-dimensional array [N][N]
     * @return array
     */
    public double[][] makeArray(int size) {
        double a[][] = new double[size][size];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = random.nextInt(30 + 1 + 10) - 10;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Task1_1 task11 = new Task1_1();
        Model model = new Model(task11.makeArray(6));
        View view = new View(model);
        Controller controller = new Controller(model, view);
        controller.run();
    }
}
