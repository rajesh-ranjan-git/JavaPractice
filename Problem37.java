import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfAttempts = 0;
        while (noOfAttempts <= 5) {
            if (noOfAttempts == 5) {
                System.out.println("Maximum attempts reached. Exiting...");
                break;
            }
            System.out.print("Enter an even number : ");
            int num = sc.nextInt();
            int temp = num & 1;
            if (temp == 0) {
                System.out.println(num + " is even.");
                noOfAttempts++;
                continue;
            }
            System.out.println("You entered an odd number. Try again...");
        }
    }
}