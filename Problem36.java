import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfAttempts = 0;
        int sum = 0;
        while (noOfAttempts <= 5) {
            if (noOfAttempts == 5) {
                System.out.println("Maximum attempts reached. Exiting...");
                break;
            }
            System.out.print("Enter number to add... : ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Skipped negative number, Sum =  " + sum);
                continue;
            }
            sum += num;
            System.out.println("Sum =  " + sum);
            noOfAttempts++;
        }
    }
}