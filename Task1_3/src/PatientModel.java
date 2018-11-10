import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.io.*;
import java.util.Scanner;

public class PatientModel {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String Address;
    private Integer numberPhone;
    private Integer medicalCard;
    private String diagnose;

    public PatientModel() { }

    public void enter() {
        InputPatient inputPatient = new InputPatient();

        System.out.println(inputPatient.getFirstName() + " " + inputPatient.getLastName());
        Id = inputPatient.getId();
        firstName = inputPatient.getFirstName();
        lastName = inputPatient.getLastName();
        patronymic = inputPatient.getPatronymic();
        Address = inputPatient.getAddress();
        numberPhone = inputPatient.getNumberPhone();
        medicalCard = inputPatient.getMedicalCard();
        diagnose = inputPatient.getDiagnose();

        //writeToFile();
    }

    private void writeToFile() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            bufferedWriter.write(String.format("%1d, %10s, %10s, %10s, %10s, %10d, %10d, %10s", Id, firstName,
                    lastName, patronymic, Address, numberPhone, medicalCard, diagnose));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
