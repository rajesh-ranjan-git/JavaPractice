import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st string to concatenate : ");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string to concatenate : ");
        String str2 = sc.nextLine();

        System.out.println("Required output after concatenation : " + str1.concat(str2).toUpperCase());
    }
}