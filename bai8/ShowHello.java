package bai8;
import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String say;
        System.out.println("Enter fullname: ");
        say = scanner.nextLine();
        System.out.printf("Hello: %s", say);
    }
}
