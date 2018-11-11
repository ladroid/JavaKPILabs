import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer extends People {
    private String firstName;
    private String lastName;
    private String task;

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public String getTask() {
        return task;
    }

    public void enter() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name");
        firstName = in.nextLine();
        setFirstName(firstName);

        System.out.println("Enter last name");
        lastName = in.nextLine();
        setLastName(lastName);

        System.out.println("Enter task");
        task = in.nextLine();
        setTask(task);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            bufferedWriter.write(String.format("%1s, %10s, %10s", firstName, lastName, task));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
