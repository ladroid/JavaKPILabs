package Task1_1;

/**
 * class Controller
 */
public class Controller {
    /**
     * model object
     */
    private Model model;

    /**
     * view object
     */
    private View view;

    /**
     * constructor takes values of model and view
     * @param model
     * @param view
     */

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * shows result
     */
    public void run() {
        view.showArray(model.getM());
        view.show(model.a());
//        for (double[]a : model.getM()) {
//            view.show(model.negSum(a));
//        }
    }
}
