package people.manager;

import people.People;

import java.io.*;
import java.util.Scanner;

public class Manager extends People {
    private String firstName;
    private String lastName;

    public Manager() { }

//    public void enterM() {
//        System.out.println("Enter name");
//        Scanner in = new Scanner(System.in);
//        firstName = in.nextLine();
//        System.out.println("Enter last name");
//        lastName = in.nextLine();
//    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

//    public void rewriteFile(people.customer.Customer customer, people.designer.Designer designer, people.teamdesigners.TeamDesigners name) {
//        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
//            bufferedWriter.write(String.format("%1s, %10s, %10s %10s %10s %10s %10s", customer.getFirstName(), customer.getLastName(),
//                    firstName, lastName, designer.amount(), name.randomName()));
//            bufferedWriter.newLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
