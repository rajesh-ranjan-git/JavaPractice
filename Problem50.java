import java.util.Scanner;

class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 int numbers to add.");
        System.out.print("Enter num1 (int) : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 (int) : ");
        int num2 = sc.nextInt();

        System.out.println("Sum : " + sum(num1, num2));

        System.out.println("Enter 3 int numbers to add.");
        System.out.print("Enter num1 (int) : ");
        int num3 = sc.nextInt();
        System.out.print("Enter num2 (int) : ");
        int num4 = sc.nextInt();
        System.out.print("Enter num3 (int) : ");
        int num5 = sc.nextInt();

        System.out.println("Sum : " + sum(num3, num4, num5));

        System.out.println("Enter 2 double numbers to add.");
        System.out.print("Enter num1 (double) : ");
        double num6 = sc.nextDouble();
        System.out.print("Enter num2 (double) : ");
        double num7 = sc.nextDouble();

        System.out.println("Sum : " + sum(num6, num7));
    }
}