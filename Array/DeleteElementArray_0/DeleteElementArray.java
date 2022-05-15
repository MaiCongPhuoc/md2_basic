package DeleteElementArray_0;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a element need detele: ");
        int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}
