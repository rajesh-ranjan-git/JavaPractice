import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of the triangle.");
        System.out.print("Base : ");
        double base = sc.nextInt();
        System.out.print("Height : ");
        double height = sc.nextInt();

        System.out.printf("Area of triangle is %f", (base * height / 2));
        sc.close();
    }
}
