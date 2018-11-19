package Task2_3;

import javafx.geometry.Point3D;

import java.util.*;
import java.awt.Point;

public class Task2_3 {
    public static void main(String[] args) {
//        Points p = new Points();
//        p.setPoints();
        Set<Point3D> points = new HashSet<>();
        points.add(new Point3D(9, 0, 0));
        points.add(new Point3D(1, 1, 1));
        points.add(new Point3D(5, 6, 6));
        points.add(new Point3D(3, 3, 3));
        points.add(new Point3D(2, 7, 7));
        points.add(new Point3D(1, 8, 8));
        points.add(new Point3D(6, 1, 1));
        System.out.println(points);

        Point p = new Point(2, 4);
        System.out.println(p.x);

        Point3D point3D = new Point3D(2, 4, 4);
        System.out.println(point3D.getX());
    }
}
