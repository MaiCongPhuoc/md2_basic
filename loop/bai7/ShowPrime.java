package bai7;

public class ShowPrime {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 3; i <= number; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) {
                System.out.printf(i + " is a prime number \n");
            }
        }
    }
}
