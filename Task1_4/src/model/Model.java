package model;

import people.customer.Customer;
import people.designer.Designer;
import people.manager.Manager;
import people.teamdesigners.TeamDesigners;
import tasks.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    private Customer customer;
    private Task task;
    private Manager manager;
    private Designer designer;
    private TeamDesigners teamDesigners;

    public Model(Customer customer, Task task, Manager manager, Designer designer, TeamDesigners teamDesigners) {
        this.customer = customer;
        this.task = task;
        this.manager = manager;
        this.designer = designer;
        this.teamDesigners = teamDesigners;
    }

    public void writeToFile(Customer customer, Task task, Manager manager, Designer designer, TeamDesigners teamDesigners) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true))) {
            bufferedWriter.write(String.format("%1s, %10s %10s %10d, %10s, %10d, %10s, %10s, %10s, %10s, %10s, %10s, %10s, %10s", customer.getFirstName(), customer.getLastName(),
                    task.getNumberFloors(), task.getHouseSquare(), task.getRooms(), task.getRoomSquare(), task.getMaterial(),
                    task.getColorWalls(), manager.getFirstName(), manager.getLastName(), designer.getFirstName(), designer.getLastName(),
                    designer.amount(), teamDesigners.randomName()));
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
