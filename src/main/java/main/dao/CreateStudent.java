package main.dao;

import main.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateStudent {


    public static List<Student> students = new ArrayList<>();

    public static Object staticStudents() {
        Student student1 = new Student("Ioannis", "Chloptsios", "19/02/1991", 2500);
        Student student2 = new Student("Thanasis", "Antedokoumbo", "20/08/1995", 2500);
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

        students.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));
    }

}
