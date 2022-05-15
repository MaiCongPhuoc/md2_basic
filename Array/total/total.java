package total;

import java.util.Scanner;

public class total {
    public static void main(String[] args) {
        int arr[][] = {
                {4,5,9},
                {7,5,3},
                {6,8,9},
        };
        System.out.println("what number of columns do you want to sum? ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("total is: ");
        int total = 0;
        for (int i = 0; i < arr.length;i++) {
            if (i == num) {
                for (int j = 0; j < arr[i].length; j++) {
                        total += arr[i][j];
                }
                System.out.println(total);
            }
        }
    }
}
