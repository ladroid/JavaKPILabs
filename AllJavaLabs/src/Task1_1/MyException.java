package Task1_1;

import java.util.InputMismatchException;

public class MyException extends InputMismatchException {
    public MyException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "Error illegal argument!!!";
    }
}
