package Task1_2;

public class MyException extends IllegalArgumentException {
    public MyException(String msg, int code) {
        super(msg + " : " + code);
    }

    @Override
    public String toString() {
        return "Error";
    }
}
