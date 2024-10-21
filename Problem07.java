import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle, rate and time for Compound Interest.");
        System.out.print("Principle : ");
        double principle = sc.nextInt();
        System.out.print("Rate : ");
        double rate = sc.nextInt();
        System.out.print("Time : ");
        double time = sc.nextInt();

        System.out.printf("Compound Interest is %f", (principle * (1 + rate / 100) * time));
        sc.close();
    }
}
