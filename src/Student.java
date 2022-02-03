public class Student {
    private final int studentNumber;
    public String firstName;
    public String lastName;

    public Student(int studentNumber, String firstName, String lastName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
