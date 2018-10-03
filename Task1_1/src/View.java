import java.util.Arrays;

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

    /**
     * shows the result
     */
    public void show() {
        //System.out.println(Arrays.deepToString(model.getM()));
        for(int i=0; i<model.getM().length; i++) {
            for(int j=0; j<model.getM().length; j++) {
                System.out.printf("%5s ", model.getM()[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for(double[] test: model.getM()) {
            System.out.printf("%s : %f\n",Arrays.toString(test), model.negSum(test));
        }
    }
}
