package Comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        IComparableCircle[] circles = new IComparableCircle[3];
        circles[0] = new IComparableCircle(3.6);
        circles[1] = new IComparableCircle();
        circles[2] = new IComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (IComparableCircle circle : circles) {
            System.out.println(circle.getRadius());
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (IComparableCircle circle : circles) {
            System.out.println(circle.getRadius());
        }
    }
}
