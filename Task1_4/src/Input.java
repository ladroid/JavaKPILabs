import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public void inputCustomer(Customer customer, Task task) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name");
        String firstName = in.nextLine();
        customer.setFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = in.nextLine();
        customer.setLastName(lastName);

        System.out.println("Enter number of floors");
        Integer numFloor = in.nextInt();
        task.setNumberFloors(numFloor);

        System.out.println("Enter number of square house");
        Integer numSquare = in.nextInt();
        task.setHouseSquare(numSquare);

        Scanner inn = new Scanner(System.in);
        System.out.println("Enter which of rooms do you want");
        String rooms = inn.nextLine();
        task.setRooms(rooms);

        System.out.println("Enter number of square rooms");
        Integer roomSquare = inn.nextInt();
        task.setRoomSquare(roomSquare);

        Scanner innn = new Scanner(System.in);
        System.out.println("Enter which of material do you want");
        String material = innn.nextLine();
        task.setMaterial(material);

        System.out.println("Enter which colors do you want");
        String color = innn.nextLine();
        task.setColorWalls(color);
    }

    public void inputManager(Manager manager) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String firstName = in.nextLine();
        manager.setFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = in.nextLine();
        manager.setLastName(lastName);
    }

    public void inputDesigner(Designer designer, Customer customer, Task task, Manager manager, TeamDesigners teamDesigners) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter name");
        String firstName = in.nextLine();
        designer.setFirstName(firstName);

        System.out.println("Enter last name");
        String lastName = in.nextLine();
        designer.setLastName(lastName);

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
