import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int r = sc.nextInt();
                    System.out.print("Enter Name: ");
                    sc.nextLine();
                    String n = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int m = sc.nextInt();
                    sms.addStudent(new Student(r, n, m));
                    break;

                case 2:
                    sms.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No: ");
                    int sr = sc.nextInt();
                    Student found = sms.searchStudent(sr);
                    if (found != null) System.out.println(found);
                    else System.out.println("Not found.");
                    break;

                case 4:
                    System.out.print("Enter Roll No: ");
                    int ur = sc.nextInt();
                    System.out.print("Enter New Name: ");
                    sc.nextLine();
                    String newName = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    int newMarks = sc.nextInt();
                    sms.updateStudent(ur, newName, newMarks);
                    break;

                case 5:
                    System.out.print("Enter Roll No: ");
                    int dr = sc.nextInt();
                    sms.deleteStudent(dr);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
