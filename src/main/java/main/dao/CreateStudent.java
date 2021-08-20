package main.dao;

import main.model.Course;

import main.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.model.CourseType.FULLTIME;

public class CreateStudent {


    public static List<Student> students = new ArrayList<>();

    public static Object staticStudents() {
        Course course1 = new Course("OOP", "Java", FULLTIME, "19/08/2021", "19/12/2021");
        Course course2 = new Course("OOP", "C#", FULLTIME, "19/08/2021", "19/12/2021");
        Student student1 = new Student("Ioannis", "Chloptsios", "19/02/1991", 2500, course1.getStream());
        Student student2 = new Student("Thanasis", "Antedokoumbo", "20/08/1995", 2500, course2.getStream());
        students.add(student1);
        students.add(student2);

        return students;
    }

    public static void studentCreation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's first name:");
        String firstName = input.nextLine();

        System.out.println("Enter student's last name:");
        String lastName = input.nextLine();

        System.out.println("Enter student's date of birth (like this dd/mm/yyyy):");
        String dateOfBirth = input.nextLine();

        System.out.println("Enter student's fees");
        int tuitionFees = input.nextInt();

        System.out.println("In which course will he studying?");
        String courseStreamStudent = input.next();

        students.add(new Student(firstName, lastName, dateOfBirth, tuitionFees, courseStreamStudent));
    }

}
