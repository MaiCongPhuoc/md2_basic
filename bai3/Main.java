package bai3;
import java.security.Signature;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter hieght: ");
        height = scanner.nextFloat();
        float erea = width * height;
        System.out.println("Erea is: " + erea);
    }
}
