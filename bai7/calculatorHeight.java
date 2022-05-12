package bai7;
import java.util.Scanner;

public class calculatorHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double bmi;
        System.out.println("nhập số cân nặng:");
        bmi = scanner.nextDouble();
        if(bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
    }
}
