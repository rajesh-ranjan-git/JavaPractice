import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nos.");
        System.out.print("Num1 : ");
        double num1 = sc.nextFloat();
        System.out.print("Num2 : ");
        double num2 = sc.nextFloat();

        System.out.printf("%f * %f = %f", num1, num2, (num1 * num2));
        sc.close();
    }
}
