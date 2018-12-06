package Task1_3.view;

import Task1_3.Task1_3;
import Task1_3.exception.IllegalArgument;
import Task1_3.exception.InputMismatch;

import java.io.Serializable;

public class ViewMenu implements Serializable {
    private IllegalArgument ia;
    private InputMismatch im;
    public ViewMenu() {
        this.ia = new IllegalArgument();
        this.im = new InputMismatch();
    }

    public void print(String printing) {
        System.out.println(printing);
    }

    public String errorMsg() {
        return ia.getMessage();
    }

    public void errorMsg(String msg) {
        System.out.println(new IllegalArgument(msg));
    }

    public String errorInpt() {
        return im.getMessage();
    }

    public void errorInpt(String msg) {
        System.out.println(new InputMismatch(msg));
    }

    public String debugLog(String msg) {
        return msg;
    }

    public String infoLog(String msg) {
        return msg;
    }

    public String warnLog(String msg) {
        return msg;
    }

    public String errorLog(String msg) {
        return msg;
    }

    public String fatalLog(String msg) {
        return msg;
    }
}
