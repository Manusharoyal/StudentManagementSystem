import java.util.ArrayList;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(int rollNo, String newName, int newMarks) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            s.setName(newName);
            s.setMarks(newMarks);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int rollNo) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }
}

