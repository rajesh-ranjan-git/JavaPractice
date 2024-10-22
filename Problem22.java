class Book {
    String title, author, isbn;
    static int totalBooks = 0;

    void borrowBook() {
        totalBooks++;
        System.out.println("Book borrowed.");
    }

    void returnBook() {
        totalBooks--;
        System.out.println("Book returned.");
    }

    static void getTotalBook() {
        System.out.printf("Total number of books borrowed : %d.", totalBooks);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.borrowBook();
        b.borrowBook();
        getTotalBook();
        b.borrowBook();
        getTotalBook();
        b.returnBook();
        getTotalBook();
        b.returnBook();
        getTotalBook();
    }
}

class Course {
    String courseName;
    int enrolledStudents;
    static int maxCapacity;

    void enrollStudent(String studentName) {
        this.enrolledStudents++;
    }
    
    void unenrollStudent(String studentName) {
        this.enrolledStudents--;
    }
    
    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    public static void main(String[] args) {
        setMaxCapacity(10);
        Course c = new Course();
        c.enrollStudent("Rajesh Ranjan");
        c.enrollStudent("Kripanidhan Kumar");
        c.enrollStudent("Sayantanee Mohanta");
        System.out.println("Number of enrolled students : " + c.enrolledStudents);
        c.unenrollStudent("Kripanidhan Kumar");
        System.out.println("Number of enrolled students : " + c.enrolledStudents);
    }
}
