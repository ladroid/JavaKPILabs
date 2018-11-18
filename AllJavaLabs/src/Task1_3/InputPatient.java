package Task1_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputPatient {
    private Integer Id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String Address;
    private Integer numberPhone;
    private Integer medicalCard;
    private String diagnose;

    public void Input() {
        System.out.println("Enter number identification");
        Scanner input = new Scanner(System.in);
        Id = input.nextInt();

        Scanner inputS = new Scanner(System.in);
        System.out.println("Enter first Name");
        firstName = inputS.nextLine();

        System.out.println("Enter last Name");
        lastName = inputS.nextLine();

        System.out.println("Enter patronymic");
        patronymic = inputS.nextLine();

        System.out.println("Enter address");
        Address = inputS.nextLine();

        System.out.println("Enter number phone");
        numberPhone = inputS.nextInt();

        System.out.println("Enter medical card");
        medicalCard = inputS.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagnose");
        diagnose = sc.nextLine();

        writeToFile();
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
