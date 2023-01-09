import java.util.Scanner;

public class test1 {
    public static int prime(int num) {
        boolean checkPrime ;
        if (num == 2) {
            System.out.println(num + "is prime ");
        } else {
            System.out.println("Prime numbers are: ");
            System.out.println(2);
            for (int i = 3; i < num; i++) {
                checkPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        checkPrime = false;
                        break;
                    }
                }
                if (checkPrime) ;
                System.out.println(i);
            }


        }
        return num;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a prime");
        int numbers;
        numbers = scanner.nextInt();
        prime(numbers);

    }
}
