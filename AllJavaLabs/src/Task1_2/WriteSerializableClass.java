package Task1_2;

import java.io.*;

public class WriteSerializableClass {
    public void writeToFileObject() {
        StringWorkModel stringWorkModel = new StringWorkModel("Hello,.", ",");
        try {
            FileOutputStream fout = new FileOutputStream(new File("task11_1.ser"));
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(stringWorkModel);

            FileInputStream fi = new FileInputStream(new File("task11_1.ser"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            StringWorkModel pr1 = (StringWorkModel) oi.readObject();
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
