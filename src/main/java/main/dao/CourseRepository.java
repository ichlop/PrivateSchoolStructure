package main.dao;

import main.dao.implement.DaoRepository;
import main.model.Course;
import main.model.CourseType;
import main.services.Validations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CourseRepository implements DaoRepository {

    public static List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> createSomething() {

        Course course1 = new Course("OOP", "Java", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course2 = new Course("OOP", "Java", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course3 = new Course("OOP", "Python", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course4 = new Course("OOP", "Python", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course5 = new Course("OOP", "C#", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course6 = new Course("OOP", "C#", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course7 = new Course("DataBase", "SQL", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course8 = new Course("DataBase", "SQL", CourseType.FULLTIME, "07/06/2021", "11/01/2022");

        courses = Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8);

        return courses;
    }


    @Override
    public void somethingCreation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter course's title:");
        String title = null;
        title = Validations.stringValidation(title, input);

        System.out.println("Enter course's stream:");
        String stream = null;
        stream = Validations.stringValidation(stream, input);

        System.out.println("Enter course's type (FULLTIME or PARTTIME):");
        String type = null;
        type = Validations.stringValidation(type, input);

        System.out.println("Enter course's start date:");
        String startDate = input.nextLine();
        Validations.dateValidation(startDate, input);

        System.out.println("Enter course's end date:");
        String endDate = input.nextLine();
        Validations.dateValidation(endDate, input);

        courses.add(new Course(title, stream, CourseType.valueOf(type), startDate, endDate));

    }

    @Override
    public void deleteSomething() {

    }
}
