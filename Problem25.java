import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        System.out.print("Enter a number to calculate absolute value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("Absolute value of %d is %d.", num, Math.abs(num));
    }
}