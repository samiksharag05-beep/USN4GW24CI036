import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    // Display students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found!");
            return;
        }
        System.out.println("ID\tName\tMarks");
        for (Student s : students) {
            s.display();
        }
    }

    // Search student by ID (Linear Search)
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // Delete student
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                System.out.println("Student Deleted!");
                return;
            }
        }
        System.out.println("Student Not Found!");
    }

    // Sort students by marks (Bubble Sort)
    public void sortByMarks() {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).marks > students.get(j + 1).marks) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        System.out.println("Students Sorted by Marks!");
    }
}
