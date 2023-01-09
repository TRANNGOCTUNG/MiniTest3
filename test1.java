import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class test1 {

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a prime");
        int numbers;
        numbers = scanner.nextInt();
        System.out.println("Prime is : ");
        int n = 2;
        while (n < numbers) {
            if (checkPrime(n)) {
                System.out.println(n);
            }
            n++;
        }
    }
}