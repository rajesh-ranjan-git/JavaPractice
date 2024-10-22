import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        System.out.println("Enter 2 nos to find minimum.");
        Scanner sc = new Scanner(System.in);
        System.out.print("num1 : ");
        int num1 = sc.nextInt();
        System.out.print("num2 : ");
        int num2 = sc.nextInt();
        int min = num1 > num2 ? num2 : num1;
        System.out.printf("Minimum of %d and %d is %d.", num1, num2, min);
    }
}