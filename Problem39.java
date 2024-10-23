import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome : ");
        String str = sc.nextLine();
        
        int start = 0;
        int end = str.length() - 1;

        boolean flag = checkPalindrome(str, start, end);
        
        if (flag) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not palindrome.");
        }
    }

    public static boolean checkPalindrome(String str, int start, int end) {
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        start++;
        end--;

        if (start < end) {
            return checkPalindrome(str, start, end);
        }

        return true;
    }
}