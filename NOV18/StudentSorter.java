package NOV18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String firstName;
    private double CGPA;

    public Student(int id, String firstName, double CGPA) {
        this.id = id;
        this.firstName = firstName;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public String toString() {
        return "Student " +
                "ID :" + id +
                ", firstName='" + firstName + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}

public class StudentSorter {
    public static void main(String[] args) throws IOException {

        List<Integer> studentsIds= new ArrayList<> ();
        List<Student> students = new ArrayList<>();

        Scanner sc= new Scanner (System.in);

        System.out.print("Enter how many inputs do you want to give : ");
        int range=sc.nextInt ();
        for(int i=0;i<range;i++){
            System.out.print("Enter id : ");
            int id=sc.nextInt ();

            if(studentsIds.contains(id)){
                System.out.println("This ID is already present try another");
                i--;
            }

            else{
                studentsIds.add(id);
                System.out.print("Enter name : ");
                String name= sc.next();

                System.out.print("Enter cgpa : ");
                double cgpa = sc.nextDouble ();
                students.add(new Student (id,name,cgpa) );
            }
        }

        // Sorting students by CGPA in descending order, then by name if CGPA is the same
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getFirstName).thenComparing(Student::getId))
                .collect(Collectors.toList());

        // Printing the sorted students
        sortedStudents.forEach(System.out::println);
    }
}