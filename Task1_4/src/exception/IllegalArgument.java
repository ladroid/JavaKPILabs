package exception;

public class IllegalArgument extends IllegalArgumentException {
    private int code;

    public IllegalArgument() {}

    public IllegalArgument(String msg, int code) {
        super(msg + " :error code " + code);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Incorrect choice";
    }
}
