package Task1_3.exception;

import java.util.InputMismatchException;

public class InputMismatch extends InputMismatchException {
    private int code;
    public InputMismatch() {}

    public InputMismatch(String msg) {
        super(msg);
    }

    public InputMismatch(String msg, int code) {
        super(msg + " :error code " + code);
        this.code = code;
    }

    @Override
    public String getMessage() {
        return "Incorreect input. Please try again";
    }

    public int getCode() {
        return code;
    }
}
