import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        System.out.print("Enter anything... : ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.nextLine();
            System.out.println("You entered : " + word);
            if (!word.equals("exit")) {
                System.out.print("Enter anything again... : ");
            } else {
                break;
            }
        }
    }
}