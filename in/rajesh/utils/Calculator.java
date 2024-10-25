package in.rajesh.utils;
import in.rajesh.geometry.Circle;
import in.rajesh.geometry.Rectangle;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter radius of circle : ");
        int radius = sc.nextInt();

        Circle c = new Circle();
        double areaCircle = c.area(radius);
        System.out.printf("Area of circle with radius %d : %f", radius, areaCircle);

        
        System.out.print("Please enter radius of circle : ");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        
        Rectangle r = new Rectangle();
        double areaRectangle = r.area(length, breadth);
        System.out.printf("Area of circle with radius %d : %f", radius, areaRectangle);
    }
}
