import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breadth and height of the rectangle.");
        System.out.print("Breadth : ");
        double breadth = sc.nextInt();
        System.out.print("Height : ");
        double height = sc.nextInt();

        System.out.printf("Perimeter of rectangle is %f", (2 * breadth + 2 * height));
        sc.close();
    }
}
