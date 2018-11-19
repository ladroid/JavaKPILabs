package Task1_1;

import java.io.*;

public class WriteSerializableClass {
    private Model model;
    public WriteSerializableClass(Model model) {
        this.model = model;
    }
    public void writeToFileObject() throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("task11_1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(model);
    }
}
