package Task1_3.writeserializableclass;

import Task1_3.Task1_3;
import Task1_3.inputpatient.InputPatient;

import java.io.*;

@Deprecated
public class WriteSerializableClass {
    public void writeToFileObject() {
        InputPatient inputPatient = new InputPatient();
        try {
            //inputPatient.input();
            FileOutputStream fout = new FileOutputStream(new File("task13_3.ser"));
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(inputPatient);

            FileInputStream fi = new FileInputStream(new File("task13_3.ser"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            InputPatient pr1 = (InputPatient) oi.readObject();
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
