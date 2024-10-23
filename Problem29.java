import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "Rajesh";

        do {
            System.out.print("Please enter your password : ");
            String pwdCheck = sc.nextLine();
            if (!password.equals(pwdCheck)) {
                System.out.println("Please enter correct password.");
            } else {
                System.out.println("Thank you! The password was correct.");
                break;
            }
        } while (true);
    }
}