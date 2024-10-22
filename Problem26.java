import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        System.out.print("Enter score to find category : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = num > 80 ? "High" : num < 50 ? "Low" : "Moderate";
        System.out.printf("Category of score is %s.", res);
    }
}