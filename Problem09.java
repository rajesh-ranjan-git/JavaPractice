import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2.");
        System.out.print("num1 : ");
        int num1 = sc.nextInt();
        System.out.print("num2 : ");
        int num2 = sc.nextInt();

        System.out.printf("num1 & num2 is %d", (num1 & num2));
        System.out.println();
        System.out.printf("num1 | num2 is %d", (num1 | num2));
        System.out.println();
        System.out.printf("num1 ^ num2 is %d", (num1 ^ num2));
        System.out.println();
        System.out.printf("~num1 is %d", (~ num1));
        System.out.println();
        System.out.printf("num1 >> num2 is %d", (num1 >> num2));
        System.out.println();
        System.out.printf("num1 << num2 is %d", (num1 << num2));
        sc.close();
    }
}
