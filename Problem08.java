import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit.");
        System.out.print("Fahrenheit : ");
        double fahrenheit = sc.nextDouble();

        System.out.printf("Temperature in Celsius is %.2f", ((fahrenheit - 32) *  (5.0 / 9.0)));
        sc.close();
    }
}
