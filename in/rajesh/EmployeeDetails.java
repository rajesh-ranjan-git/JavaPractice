package in.rajesh;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        e.setName(name);

        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        e.setAge(age);

        System.out.print("Please enter your salary : ");
        double salary = sc.nextDouble();
        e.setSalary(salary);

        e.displayEmployeeDetails();
    }
}
