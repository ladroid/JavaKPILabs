import java.io.*;
import java.util.Scanner;

public class PatientView {
    private ReadInformation readInformation;

    public PatientView(ReadInformation readInformation) {
        this.readInformation = readInformation;
    }

    public void enterInfo(InputPatient ipat, PatientModel pm) {
        ipat.Input();
        pm.enter();
    }

    public void read(ReadInfoChoice readInfoChoice) throws FileNotFoundException {
        readInfoChoice.readChoice(readInformation);
    }
}