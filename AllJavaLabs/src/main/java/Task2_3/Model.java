package Task2_3;

import java.util.Set;

public class Model {
    public Double sumMin(Set<Points> points) {
        Double summ = 0.0;

        for(Points ob : points) {
            summ += Math.sqrt(Math.pow(ob.getX(), 2) + Math.pow(ob.getY(), 2));
        }

        return summ;
    }
}
