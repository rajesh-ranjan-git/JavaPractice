import java.util.Scanner;

public class Problem46 {
    final String name;
    final int age;

    Problem46(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        Problem46 obj = new Problem46(name, age);

        System.out.printf("Your name is %s and your age is %d.", obj.name, obj.age);
        System.out.println();
        System.out.print("Do you want to try to change your name or age? (Y/N): ");
        String input = sc.next();
        if (input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
            // obj.name = "Kripanidhan"; // Final fields cannot be changed and will show issue at compile time.
            System.out.println("Your name and age cannot be changed! Please try again in another life.");
        } else {
            System.out.println("Thank You!");
        }
    }
}