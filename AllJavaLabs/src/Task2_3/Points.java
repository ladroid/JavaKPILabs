package Task2_3;

import javafx.geometry.Point3D;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Points {
    public void setPoints() {
        System.out.println("Enter counts");
        Scanner in = new Scanner(System.in);
        Integer counts = in.nextInt();

        System.out.println("Enter x y z");
        Scanner inn = new Scanner(System.in);
        Set<Point3D> points = new HashSet<>();

        for(int i=0; i<counts; i++) {
            while (inn.hasNextInt()) {
                points.add(new Point3D(inn.nextInt(), inn.nextInt(), inn.nextInt()));
            }
        }
        Integer [] nums = points.toArray(new Integer[0]);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
