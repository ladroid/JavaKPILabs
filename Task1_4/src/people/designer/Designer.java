package people.designer;

import people.People;

import java.util.*;
import java.text.*;

public class Designer extends People {
    private String firstName;
    private String lastName;

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

//    public void write() {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter name");
//        firstName = in.nextLine();
//        setFirstName(firstName);
//
//        System.out.println("Enter last name");
//        lastName = in.nextLine();
//        setLastName(lastName);
//    }

    private double randomize(int rangeMin, int rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        return randomValue;
    }

    public String amount() {
        double amount = randomize(50, 1000);
        Locale locale = new Locale("ua", "UA");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amount));

        return currencyFormatter.format(amount);
    }
}
