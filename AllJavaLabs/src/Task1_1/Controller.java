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

    private WriteSerializableClass writeSerializableClass;

    private ReadFile readFile;

    /**
     * constructor takes values of model and view
     * @param model
     * @param view
     */

    public Controller(Model model, View view, WriteSerializableClass writeSerializableClass, ReadFile readFile) {
        this.model = model;
        this.view = view;
        this.writeSerializableClass = writeSerializableClass;
        this.readFile = readFile;
    }

    /**
     * shows result
     */
    public void run() {
        view.showArray(model.getM());
        view.show(model.a());
        view.read(readFile, model);
        writeSerializableClass.writeToFileObject();
    }
}
