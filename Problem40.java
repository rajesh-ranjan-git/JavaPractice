import java.util.Scanner;

class Student {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name : " + this.name + "\nAge : " + this.age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        st.setName(name);

        System.out.print("Enter age : ");
        int age = sc.nextInt();
        st.setAge(age);
        
        String res = st.toString();

        System.out.println(res);
    }
}