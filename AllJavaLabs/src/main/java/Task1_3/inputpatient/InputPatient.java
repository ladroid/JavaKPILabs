package Task1_3.inputpatient;

import Task1_3.Task1_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class InputPatient implements Serializable {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String Address;
    private Integer numberPhone;
    private Integer medicalCard;
    private String diagnose;

    public void setId(Integer id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setMedicalCard(Integer medicalCard) {
        this.medicalCard = medicalCard;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
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

    @Override
    public String toString() {
        return Id + " " + firstName + " " + lastName + " " + patronymic + " " +Address + " " +
                numberPhone + " " + medicalCard + " " + diagnose;
    }
}
