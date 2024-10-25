import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int randomInt;

        do {       
            randomInt = (int) (Math.random() * 10);
            System.out.print("Guess a number between 0 to 10 : ");

            int input = sc.nextInt();
            if (input == randomInt) {
                System.out.println("Congratulations! You guessed it right.");
                break;
            } else {
                System.out.println("Oops! You guessed it wrong. Lets try again!");
            }
        } while (true);
    }
}