package bai9;

import java.util.Scanner;

public class ConvertToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String str;
        System.out.println("nhập số muốn chuyển thành chuỗi.");
        n = scanner.nextInt();
        switch (n) {
            case 1:str = "One";
                break;
            case 2:str = "Two";
                break;
            case 3:str = "three";
                break;
            case 4:str = "four";
                break;
            case 5:str = "Six";
                break;
            case 6:str = "Six";
                break;
            case 7:str = "Seven";
                break;
            case 8:str = "Eight";
                break;
            case 9:str = "Nine";
                break;
            default: str = "out of ability";
        }
        System.out.printf("%s %s", str, str);
    }
}
