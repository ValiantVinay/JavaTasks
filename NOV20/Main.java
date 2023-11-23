package NOV20;
import java.util.*;

class Student implements Comparable<Student> {
    String id;
    String firstName;
    double cgpa;

    public Student(String id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student other) {
        // Sort by CGPA in descending order
        int cgpaComparison = Double.compare(other.cgpa, this.cgpa);
        if (cgpaComparison != 0) {
            return cgpaComparison;
        }

        // If CGPA is the same, sort by first name in alphabetical order
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        // If first name is also the same, sort by ID
        return this.id.compareTo(other.id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input the student information
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");
            String id = studentInfo[0];
            String firstName = studentInfo[1];
            double cgpa = Double.parseDouble(studentInfo[2]);
            students.add(new Student(id, firstName, cgpa));
        }

        // Sort the students using the compareTo method in the Student class
        Collections.sort(students);

        // Print the results
        for (Student student : students) {
            System.out.println(student.firstName);
        }
    }
}

