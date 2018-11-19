package Task1_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StringWorkController {
    private StringWorkModel stringWorkModel;
    private StringWorkView stringWorkView;
    private WriteSerializableClass writeSerializableClass;
    private ReadFile readFile;

    public StringWorkController(StringWorkModel stringWorkModel, StringWorkView stringWorkView, WriteSerializableClass writeSerializableClass, ReadFile readFile) {
        this.stringWorkModel = stringWorkModel;
        this.stringWorkView = stringWorkView;
        this.writeSerializableClass = writeSerializableClass;
        this.readFile = readFile;
    }

    public void run() {
        stringWorkView.view(stringWorkModel);
    }

    public void start() {
        stringWorkView.read(readFile, stringWorkModel);
    }

    public void start1() throws FileNotFoundException, IOException {
        String str = "Hello, my name is Lado., I am from Ukraine., I born in Kiev., I think, that this is all.,";

        Scanner boges = new Scanner(System.in);
        System.out.println("Enter scanner for input from console or function for showing result");
        String answer = boges.nextLine();
        try {
            switch (Choice.valueOf(answer.trim())) {
                case SCANNER:
                    stringWorkView.view(stringWorkModel);
                    break;
                case FUNCTION:
                    stringWorkModel = new StringWorkModel(str, ",");
                    stringWorkView.view(stringWorkModel);
                    break;
                case FILE:
                    stringWorkView.read(readFile, stringWorkModel);
                    break;
                case SERIALIZABLEW:
                    writeSerializableClass.writeToFileObject();
                default:
                    throw new MyException("Error", 1);
            }
        } catch (IllegalArgumentException iae) {
            throw new MyException("Error", 1);
        }
    }
}
