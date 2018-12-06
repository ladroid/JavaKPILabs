package Task1_3.exception;

import Task1_3.Task1_3;

@SuppressWarnings("serial")
public class IllegalArgument extends IllegalArgumentException {
    private int code;
    public IllegalArgument() {}

    public IllegalArgument(String msg) {
        super(msg);
    }

    public IllegalArgument(String msg, int code) {
        super(msg + " :error code " + code);
        this.code = code;
    }

    @Override
    public String getMessage() {
        return "Incorreect choice. Please try again";
    }

    public int getCode() {
        return code;
    }
}
