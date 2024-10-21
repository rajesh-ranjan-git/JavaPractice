import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        System.out.print("num : ");
        int num = sc.nextInt();
        int res = num & 1;

        if (res == 0) {
            System.out.printf("Num %d is %s.", num, "Even");
        } else {
            System.out.printf("Num %d is %s.", num, "Odd");
        }

        sc.close();
    }
}
