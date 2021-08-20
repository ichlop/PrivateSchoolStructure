package main.dao;

import main.model.Course;
import main.model.CourseType;

import java.util.Arrays;
import java.util.List;

public class CreateCourse {

    public static List<Course> courseCreation(){

        Course course1 = new Course("OOP", "Java", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course2 = new Course("OOP", "Java", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course3 = new Course("OOP", "Python", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course4 = new Course("OOP", "Python", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course5 = new Course("OOP", "C#", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course6 = new Course("OOP", "C#", CourseType.PARTTIME, "07/06/2021", "07/10/2021");
        Course course7 = new Course("DataBase", "SQL", CourseType.FULLTIME, "07/06/2021", "11/01/2022");
        Course course8 = new Course("DataBase", "SQL", CourseType.FULLTIME, "07/06/2021", "11/01/2022");

        List<Course> courses = Arrays.asList(course1, course2, course3, course4, course5, course6, course7, course8);


        return courses;
    }

}
