import java.util.Scanner;

class Problem42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Provide radius : ");
        int radius = sc.nextInt();

        System.out.printf("Area : %.2f", (Math.PI * Math.pow(radius, 2)));
        System.out.println();
        System.out.printf("Circumference : %.2f", (2 * Math.PI * radius));
    }
}