import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        System.out.println("Enter 2 nos to perform arithmetic operation.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.print("Which operation you wish to perform (+, -, *, /, %) : ");
        sc.nextLine();
        String operation = sc.nextLine();
        
        switch (operation.charAt(0)) {
            case '+' : System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;
            case '-' : System.out.printf("%d - %d = %d", num1, num2, Math.abs(num1 - num2));
                break;
            case '*' : System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
                break;
            case '/' : System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                break;
            case '%' : System.out.printf("%d % %d = %d", num1, num2, num1 % num2);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}