import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle, rate and time for Simple Interest.");
        System.out.print("Principle : ");
        double principle = sc.nextInt();
        System.out.print("Rate : ");
        double rate = sc.nextInt();
        System.out.print("Time : ");
        double time = sc.nextInt();

        System.out.printf("Simple Interest is %f", (principle * rate * time / 100));
        sc.close();
    }
}
