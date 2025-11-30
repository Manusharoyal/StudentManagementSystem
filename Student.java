public class Student {
    private int rollNo;
    private String name;
    private int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return rollNo + " | " + name + " | " + marks;
    }
}
