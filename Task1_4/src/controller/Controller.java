package controller;

import exception.IllegalArgument;
import menuenum.MenuEnum;
import model.Model;
import people.customer.Customer;
import people.designer.Designer;
import people.manager.Manager;
import people.teamdesigners.TeamDesigners;
import tasks.Task;
import view.ReadInfo;
import view.View;

import java.util.Scanner;

public class Controller {
    private Customer customer;
    private Manager manager;
    private View view;
    private Designer designer;
    private TeamDesigners teamDesigners;
    private ReadInfo readInfo;
    private Model model;
    private Task task;

    public Controller(Model model, Customer customer, Task task, Manager manager, View view, Designer designer, TeamDesigners teamDesigners, ReadInfo readInfo) {
        this.customer = customer;
        this.manager = manager;
        this.view = view;
        this.designer = designer;
        this.teamDesigners = teamDesigners;
        this.readInfo = readInfo;
        this.model = model;
        this.task = task;
    }

    public void start() throws IllegalArgument {
        System.out.println("=====================");
        System.out.println("=Building department=");
        System.out.println("=====================");
        System.out.println("Choose a choice");
        System.out.println("1)Enter\n2)Read");

        //view.inputData();

        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        try {
            switch (MenuEnum.valueOf(choice.trim())) {
                case Enter:
                    view.inputData();
                    model.writeToFile(customer, task, manager, designer, teamDesigners);
                    break;
                case Read:
                    view.readS(readInfo);
                    break;
                default:
                    throw new IllegalArgument("Error", 1);
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgument("Error", 1);
        }
    }
}
