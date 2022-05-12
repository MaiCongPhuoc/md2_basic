package bai6;
import java.util.Scanner;

public class TextLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("nhập số năm");
        year = scanner.nextInt();
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                System.out.printf("%d là năm nhuận \n", year);
            } else if (year % 400 == 0) {
                System.out.printf("%d không phải là năm nhuận \n", year);
            } else {
                System.out.printf("%d không phải là năm nhuận \n", year);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận \n", year);
        }
    }
}
