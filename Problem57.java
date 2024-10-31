public class Problem57 {
    public static void main(String[] args) {
        Eagle e = new Eagle();

        e.fly();
    }
}

interface Flyable {
    abstract void fly();
}

abstract class Bird implements Flyable {
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Fly method implemented by Eagle class.");
    }

}