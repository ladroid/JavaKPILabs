package Task2_3;

import java.util.*;
import java.awt.Point;

public class Task2_3 {
    private double num() {
        Random rng = new Random();
        double numbr = ((rng.nextInt(35)+1)-10)/100.0;
        return numbr;
    }

    public Set<Points> setMaker() {
        Scanner in = new Scanner(System.in);
        Set<Points> pointss = new HashSet<>();

        int n = in.nextInt();
        for(int i =0; i<n; i++) {
            pointss.add(new Points(num(), num()));
        }

        System.out.println(pointss);

        return pointss;
    }

    public static void main(String[] args) throws InterruptedException {
        Controller controller = new Controller();
        controller.run();
    }

    @Deprecated
    private static void add() {
        Scanner in = new Scanner(System.in);
        Set<Points> pp = new HashSet<>();

        int n = in.nextInt();
        for(int i =0; i<n; i++) {
            pp.add(new Points(in.nextDouble(), in.nextDouble()));
        }
        System.out.println(pp);

        Double summ = 0.0;
        for(Points ob : pp) {
            summ += Math.sqrt(Math.pow(ob.getX(), 2) + Math.pow(ob.getY(), 2));
        }
        System.out.println(summ);
    }

    @Deprecated
    private static void equition_plane() {
        Set<Point> points = new HashSet<>();
        points.add(new Point(9, 0));
        points.add(new Point(1, 1));
        points.add(new Point(5, 6));
        points.add(new Point(3, 3));
        points.add(new Point(2, 7));
        points.add(new Point(1, 8));
        points.add(new Point(6, 1));
        //System.out.println(points);

        Double sum = 0.0;
        for(Point ob : points) {
            sum += Math.sqrt(Math.pow(ob.getX(), 2) + Math.pow(ob.getY(), 2));
        }
        //System.out.println(sum);


        Set<Points> pointss = new HashSet<>();
        pointss.add(new Points(0.6, 5.1));
        pointss.add(new Points(-6.2, 4.7));
        pointss.add(new Points(-4.7, 7.4));
        pointss.add(new Points(-4.5, 0.8));
        System.out.println(pointss);

        Double summ = 0.0;
        for(Points ob : pointss) {
            summ += Math.sqrt(Math.pow(ob.getX(), 2) + Math.pow(ob.getY(), 2));
        }
        System.out.println(summ);
//        Set<Integer> integers = new HashSet<>(Arrays.asList(10, 20, 30));
//
//        Integer integerSum = integers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println("summation: " + integerSum);
    }
}