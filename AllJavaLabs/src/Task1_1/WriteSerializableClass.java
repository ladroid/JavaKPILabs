package Task1_1;

import java.io.*;

public class WriteSerializableClass {
    public void writeToFileObject() {
        Task1_1 task1_1 = new Task1_1();
        Model model = new Model(task1_1.makeArray());
        try {
            FileOutputStream fout = new FileOutputStream(new File("task11_1.ser"));
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(model);

            FileInputStream fi = new FileInputStream(new File("task11_1.ser"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            Model pr1 = (Model) oi.readObject();
            System.out.println(pr1.toString());

        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}
