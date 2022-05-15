package SunDiagonalLine;


public class SunDiagonalLine {
    public static void main(String[] args) {
        int arr[][] = {
                {4,5,9},
                {7,5,3},
                {6,8,9},
        };
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int total = 0;
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j + 2 || i + 2 == j || i == j) {
                    total += arr[i][j];
                }
            }
        }
        System.out.println("diagonal is: " + total);
    }
}
