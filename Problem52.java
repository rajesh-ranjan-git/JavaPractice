import java.util.Scanner;

public class Problem52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to divide.");
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        try {
            System.out.println("Result : " + num1 / num2);
        } catch (ArithmeticException ae) {
            System.out.println("Oops! You are trying to divide by 0.");
        }
    }
}