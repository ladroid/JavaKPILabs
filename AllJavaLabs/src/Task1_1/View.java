package Task1_1;

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

    public void read(ReadFile readFile, Model model) {
        readFile.readResult(model);
    }
}
