package FindElementArray_0;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        String[] students = {"phuoc", "luong", "ngoc", "loc", "tri", "minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Emter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length;i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the student in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
