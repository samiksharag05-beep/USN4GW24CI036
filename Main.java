import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    manager.addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    manager.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    manager.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    manager.sortByMarks();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}
