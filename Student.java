public class Student {
    int id;
    String name;
    int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Display student
    public void display() {
        System.out.println(id + "\t" + name + "\t" + marks);
    }
}
