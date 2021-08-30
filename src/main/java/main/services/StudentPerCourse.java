package main.services;

import main.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentPerCourse {

    public static List<Student> javaStudents = new ArrayList<>();
    public static List<Student> cSharpStudents = new ArrayList<>();
    public static List<Student> sqlStudents = new ArrayList<>();
    public static List<Student> pythonStudents = new ArrayList<>();

    public static void splitCourse(String firstName, String lastName, String dateOfBirth, int tuitionFees) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the courses that the student will join with comma seperated (like this: a, b, c)");
        String courseStream = input.nextLine();
//        List<String> studentPerCourseList = Arrays.asList(courseStream.split("\\s*,\\s*"));
        String[] sp = courseStream.split(", ");
        List<String> studentPerCourseList = new ArrayList<>();
        for (int i = 0; i < sp.length; i++) {
            studentPerCourseList.add(sp[i]);
        }

        for (int i = 0; i < studentPerCourseList.size(); i++) {
            if (studentPerCourseList.get(i) == "Java") {
                javaStudents.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));
            } else if (studentPerCourseList.get(i) == "C#") {
                cSharpStudents.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));
            } else if (studentPerCourseList.get(i) == "SQL") {
                sqlStudents.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));
            } else if (studentPerCourseList.get(i) == "Python") {
                pythonStudents.add(new Student(firstName, lastName, dateOfBirth, tuitionFees));
            }
        }

    }

}
