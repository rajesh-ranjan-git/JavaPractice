import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        System.out.print("Enter a number to find even or odd : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = num & 1;
        if (res == 0) {
            System.out.printf("%d is even.", num);
        } else {
            System.out.printf("%d is odd.", num);
        }
    }
}