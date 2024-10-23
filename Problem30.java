import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 26;

        do {
            System.out.print("Guess the number  : ");
            int numCheck = (int) sc.nextInt();
            if (numCheck != num) {
                System.out.println("Wrong! Please try again.");
            } else {
                System.out.println("Congratulations! You won.");
                break;
            }
        } while (true);
    }
}