import sun.security.krb5.internal.crypto.Des;

import java.io.*;
import java.util.Scanner;

public class Manager {
    private String firstNameM;
    private String lastNameM;

    public Manager() {
        System.out.println("Enter name");
        Scanner in = new Scanner(System.in);
        firstNameM = in.nextLine();
        System.out.println("Enter last name");
        lastNameM = in.nextLine();
    }

    public String getFirstNameM() {
        return firstNameM;
    }

    public String getLastNameM() {
        return lastNameM;
    }

    public void rewriteFile(Customer customer, Designer designer, TeamDesigners name) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            bufferedWriter.write(String.format("%1s, %10s, %10s %10s %10s %10s %10s", customer.getFirstName(), customer.getLastName(),
                    customer.getTask(), firstNameM, lastNameM, designer.amount(), name.randomName()));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
