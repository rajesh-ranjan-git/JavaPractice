class Vehicle {
    public String service() {
        return "Vehicle service method";
    }
}

class Car extends Vehicle {
    public String service() {
        System.out.println(super.service());
        return "Car service method";
    }

    public static void main(String[] args) {
        Car c = new Car();

        System.out.println(c.service());
    }
}