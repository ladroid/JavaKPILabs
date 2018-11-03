import java.util.*;
import java.text.*;

public class Designer {

    private double Randomize(int rangeMin, int rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

        return randomValue;
    }

    public String amount() {
        double amount = Randomize(50, 1000);
        Locale locale = new Locale("ua", "UA");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amount));

        return currencyFormatter.format(amount);
    }
}
