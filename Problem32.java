import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wish to check for prime or composite : ");
        int num = sc.nextInt();

        if (checkPrime(num)) {
            System.out.printf("%d is prime.", num);
        } else {
            System.out.printf("%d is composite.", num);
        }
    }
    
    public static boolean checkPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        for (int i = 4; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}