import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you wish to get the table for : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d", num, i, num * i);
            System.out.println();
        }
    }
}