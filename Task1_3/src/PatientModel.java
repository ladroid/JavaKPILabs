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
    private InputPatient inputPatient;

    public PatientModel() { }

    public PatientModel(Integer Id, String firstName, String lastName, String patronymic, String Address, Integer numberPhone, Integer medicalCard, String diagnose) {
        this.Id = Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.Address = Address;
        this.numberPhone = numberPhone;
        this.medicalCard = medicalCard;
        this.diagnose = diagnose;
    }

    public void enter() {
        inputPatient = new InputPatient();
        inputPatient.Input();

        Id = inputPatient.getId();
        firstName = inputPatient.getFirstName();
        lastName = inputPatient.getLastName();
        patronymic = inputPatient.getPatronymic();
        Address = inputPatient.getAddress();
        numberPhone = inputPatient.getNumberPhone();
        medicalCard = inputPatient.getMedicalCard();
        diagnose = inputPatient.getDiagnose();

        writeToFile();
    }

    public void setMedicalCard(Integer medicalCard) {
        this.medicalCard = medicalCard;
    }

    public Integer getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return Address;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public Integer getMedicalCard() {
        return medicalCard;
    }

    public String getDiagnose() {
        return diagnose;
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
