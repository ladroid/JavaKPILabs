import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer {
    private String firstName;
    private String lastName;
    private String task;

    public Customer() { }

    public void enter() {
        System.out.println("Enter name");
        Scanner in = new Scanner(System.in);
        firstName = in.nextLine();
        System.out.println("Enter last name");
        lastName = in.nextLine();
        System.out.println("Enter task");
        task = in.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTask() {
        return task;
    }

    public void writeToFile() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            bufferedWriter.write(String.format("%1s, %10s, %10s", firstName, lastName, task));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
