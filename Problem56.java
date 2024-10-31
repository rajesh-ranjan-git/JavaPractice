public class Problem56 {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Square s = new Square(12);

        System.out.println("Are of circle is : " + c.calculateArea());
        System.out.println("Area of square is " + s.calculateArea());
    }
}

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return this.side * this.side;
    }

}