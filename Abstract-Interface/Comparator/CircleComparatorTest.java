package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(3.0);
        circles[2] = new Circle(3.2, "red", true);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getRadius());
        }
    }
}
