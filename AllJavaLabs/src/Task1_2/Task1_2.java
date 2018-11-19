package Task1_2;

import java.io.IOException;

public class Task1_2 {
    public static void main(String[] args) {
        StringWorkModel stringWorkModel = new StringWorkModel();
        StringWorkView stringWorkView = new StringWorkView();
        WriteSerializableClass writeSerializableClass = new WriteSerializableClass();
        StringWorkController stringWorkController = new StringWorkController(stringWorkModel, stringWorkView, writeSerializableClass);

        try {
            stringWorkController.start1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
