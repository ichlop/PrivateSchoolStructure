package main.dao;

import main.dao.implement.DaoRepository;
import main.model.Student;
import main.services.StudentPerCourse;
import main.services.Validations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements DaoRepository {

    public static List<Student> students = new ArrayList<>();

    @Override
    public List<Student> createSomething() {
        Student student1 = new Student("Ioannis", "Chloptsios", "19/02/1991", 2500);
        Student student2 = new Student("Thanasis", "Antedokoumbo", "20/08/1995", 2500);
        students.add(student1);
        students.add(student2);

        return students;
    }

    @Override
    public void somethingCreation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student's first name:");
        String firstName = null;
        firstName = Validations.stringValidation(firstName, input);

        System.out.println("Enter student's last name:");
        String lastName = null;
        lastName = Validations.stringValidation(lastName, input);

        System.out.println("Enter student's date of birth (like this dd/mm/yyyy):");
        String dateOfBirth = input.nextLine();
        Validations.dateValidation(dateOfBirth, input);

        System.out.println("Enter student's fees");
        int tuitionFees = 0;
        tuitionFees = Validations.feeValidation(tuitionFees, input);

        students.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));

        StudentPerCourse.splitCourse(firstName, lastName, dateOfBirth, tuitionFees);

    }

    @Override
    public void deleteSomething() {
        System.out.println("Give the firstname and the last name of the student you want to delete");

        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        String lName = sc.nextLine();

        students.remove(new Student(fName, lName));

        if (StudentPerCourse.javaStudents.contains(new Student(fName,lName))) {
            StudentPerCourse.javaStudents.remove(new Student(fName, lName));
        } else if (StudentPerCourse.cSharpStudents.contains(new Student(fName,lName))) {
            StudentPerCourse.cSharpStudents.remove(new Student(fName, lName));
        } else if (StudentPerCourse.sqlStudents.contains(new Student(fName,lName))) {
            StudentPerCourse.sqlStudents.remove(new Student(fName, lName));
        } else if (StudentPerCourse.pythonStudents.contains(new Student(fName,lName))) {
            StudentPerCourse.pythonStudents.remove(new Student(fName, lName));
        }
    }
}
