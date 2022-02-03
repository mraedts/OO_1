import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        // use java.util.scanner for terminal input

        System.out.println("Please enter the group size:");

        Scanner scanner = new Scanner(System.in);
        final int groupSize = scanner.nextInt();
        Student[] students = new Student[groupSize];

        for (int i = 0; i < groupSize;i++) {
            System.out.println("Please enter a student:");
            int studentNumber = scanner.nextInt();
            String firstName = scanner.next();
            String lastName = scanner.next();
            students[i] = new Student(studentNumber,firstName,lastName);
        }
        System.out.println("The group now contains:");
        for (int i = 0; i < groupSize; i++) {
            System.out.println( students[i].firstName + " " +
                                students[i].lastName  + ", s" +
                                students[i].getStudentNumber());
        }
        while (true) {
            System.out.println("Student number and new given/family name?");
            int studentNumber = scanner.nextInt();
            if (studentNumber < 0) {
                return;
            } else {
                for (int i = 0; i < groupSize; i++) {
                    if (students[i].getStudentNumber().equa(studentNumber)) {
                        students[i].firstName = scanner.next();
                        students[i].lastName = scanner.next();
                    }
                }
            }
        }







    }
}
