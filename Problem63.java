import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem63 {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new PriorityQueue<Student>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade();
            };
        });
        
        studentQueue.offer(new Student("Rajesh", 'A'));
        studentQueue.offer(new Student("Sayantanee", 'C'));
        studentQueue.offer(new Student("Rahee", 'D'));
        studentQueue.offer(new Student("Kripanidhan", 'E'));
        studentQueue.offer(new Student("Gurjit", 'D'));
        studentQueue.offer(new Student("Abhishek", 'E'));

        System.out.println("Queue is : " + studentQueue);
        System.out.println("Got : " + studentQueue.poll());
        System.out.println("Got : " + studentQueue.poll());
        System.out.println("Got : " + studentQueue.poll());
        System.out.println("Got : " + studentQueue.poll());
        System.out.println("Got : " + studentQueue.poll());
        System.out.println("Got : " + studentQueue.poll());
    }
}

class Student {
    private final String name;
    private final char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public char getGrade() {
        return this.grade;
    }

    public String toString() {
        return this.name + " : " + this.grade;
    }
}
