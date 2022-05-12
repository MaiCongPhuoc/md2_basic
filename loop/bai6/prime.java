package bai6;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("enter number you want show prime");
        number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count <= number) {
            if (n ==2) {
                count++;
            }
            if (n > 2) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0)
                        break;
                    else
                    if (i == (n - 1)) {
                        System.out.printf(n + " is a ptime number. \n");
                        count++;
                    }
                }
            }
            n++;
        }
    }
}
