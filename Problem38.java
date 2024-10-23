import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit till you need the Fibonacci Series : ");
        int num = sc.nextInt();
        System.out.print(1 + "\t" + 2 + "\t");
        fibonacciSeries(num, 1, 2);
    }

    public static void fibonacciSeries(int num, int pointer1, int pointer2) {
        if (pointer2 < num) {
            int temp = pointer2;
            pointer2 = pointer1 + pointer2;
            pointer1 = temp;
            System.out.print(pointer2 + "\t");
            fibonacciSeries(num, pointer1, pointer2);
        }
    }
}