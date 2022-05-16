package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation1 test = new QuadraticEquation1(a, b, c);
        if(a == 0) {
            System.out.println("here is first degree equation");
            return;
        } else {
            if(test.getDiscriminant() < 0) {
                System.out.println("the equation has no solution");
                return;
            } else if (test.getDiscriminant() == 0) {
                System.out.println("the equation has two double solutions" + test.getdoubleSolution());
            } else {
                System.out.println("the equation has two solutions x1: " + test.getRoot1());
                System.out.println("the equation has two solutions x2: " + test.getRoot2());
            }
        }
    }
}
