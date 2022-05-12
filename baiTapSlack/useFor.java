package baiTapSlack;
import java.util.Scanner;

public class useFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("phập số nguyên dương n cần vẽ tam giác");
        int n = scanner.nextByte();
        for (int i = 1; i <= n - 1; i++) {
            if (i == 1) {
                for (int j = 1; j <= (n - 1); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int j = 1; j <= (n - i -1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i < (n - 1)) {
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            if ((i + 2) == n) {
                for (int h = 1; h < (n * 2 - 1);h++) {
                    System.out.print("*");
                }
            }
        }
    }
}