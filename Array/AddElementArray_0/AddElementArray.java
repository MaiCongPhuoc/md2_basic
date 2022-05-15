package AddElementArray_0;

import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("enter the number to inse: ");
        int x = scanner.nextInt();
        System.out.println("enter the position to inset in array:");
        int i = scanner.nextInt();
        if(i <= -1 || i > arr.length) {
            System.out.println("cann't insset in array");
        } else {
            for (int j = 0; j < arr.length; j++) {
                if (j + 1 == i) {
                    arr[j] = x;
                }
                System.out.print(arr[j] + " ");
            }
        }
    }
}
