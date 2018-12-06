package Task1_3.model;

import Task1_1.View;
import Task1_3.inputpatient.InputPatient;
import Task1_3.view.PatientView;
import Task1_3.view.ViewMenu;
import org.apache.log4j.Logger;

import java.io.*;

public class Model {
    private InputPatient inputPatient;
    private PatientView patientView;
    private transient ViewMenu viewMenu;
    private final transient Logger logger = Logger.getLogger(Model.class);

    public Model(InputPatient inputPatient, PatientView patientView) {
        this.inputPatient = inputPatient;
        this.patientView = patientView;
        this.viewMenu = new ViewMenu();
    }

    public void writeToFile() {
        logger.debug(viewMenu.debugLog("Start method writeToFile()"));
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            logger.info(viewMenu.infoLog("Write datas to file"));
            bufferedWriter.write(String.format("%1d, %10s, %10s, %10s, %10s, %10d, %10d, %10s", inputPatient.getId(), inputPatient.getFirstName(),
                    inputPatient.getLastName(), inputPatient.getPatronymic(), inputPatient.getAddress(), inputPatient.getNumberPhone(), inputPatient.getMedicalCard(), inputPatient.getDiagnose()));
            bufferedWriter.newLine();
        } catch (IOException e) {
            logger.error(viewMenu.errorLog("IOException"));
            e.printStackTrace();
        }
    }

    public void writeSerializable() {
        try {
            patientView.input();
            FileOutputStream fout = new FileOutputStream(new File("task13_3.ser"));
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            //write
            oos.writeObject(patientView);
            oos.close();
            fout.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
