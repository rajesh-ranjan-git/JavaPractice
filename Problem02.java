import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nos.");
        System.out.print("Num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Num2 : ");
        int num2 = sc.nextInt();

        System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
        System.out.println();
        System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
        System.out.println();
        System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
        System.out.println();
        System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
        System.out.println();
        System.out.printf("%d mod %d = %d", num1, num2, (num1 % num2));
        sc.close();
    }
}
