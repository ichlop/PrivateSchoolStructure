package main.menu;

import main.dao.AssignmentRepository;
import main.dao.CourseRepository;
import main.dao.StudentRepository;
import main.dao.TrainerRepository;
import main.model.Course;

import java.text.ParseException;
import java.util.Scanner;

import static main.dao.AssignmentRepository.assignments;
import static main.dao.CourseRepository.courses;
import static main.dao.StudentRepository.students;
import static main.dao.TrainerRepository.trainers;
import static main.services.StudentPerCourse.*;

public class Menu {

    public static void mainMenu() {
        StudentRepository sr = new StudentRepository();
        sr.createPerson();
        TrainerRepository tr = new TrainerRepository();
        tr.createPerson();
        AssignmentRepository ar = new AssignmentRepository();
        ar.assignmentCreation();
        CourseRepository cr = new CourseRepository();
        cr.createCourses();

        boolean prog = true;

        while (prog) {

            System.out.println();
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("This is a Private School menu");
            System.out.println("-----------------------------");
            System.out.println(
                    "Type '1' to add a new student \n" +
                            "Type '2' to delete a new student \n" +
                            "Type '3' to add a new trainer \n" +
                            "Type '4' to delete a new trainer \n" +
                            "Type '5' to choose what list you want to see \n" +
                            "Type '6' to see the students for each course\n" +
                            "Type '7' and type the date to see students that owe submissions\n" +
                            "Type '8' to exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    sr.personCreation();
                    break;
                case 2:

                    sr.deletePerson();
                    break;
                case 3:
                    tr.personCreation();

                    break;
                case 4:
                    tr.deletePerson();
                    break;
                case 5:
                    System.out.println(
                            "For student's list type 1 \n" +
                                    "For trainer's list type 2 \n" +
                                    "For assignment's list type 3 \n" +
                                    "For course's list type 4");
                    int choiceList = sc.nextInt();
                    switch (choiceList) {
                        case 1:

                            System.out.println(students);

                            break;
                        case 2:

                            System.out.println(trainers);

                            break;
                        case 3:
                            System.out.println(assignments);

                            break;
                        case 4:
                            System.out.println(courses);

                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.out.println(
                            "For Java's list type '1' \n" +
                                    "For C#'s list type '2' \n" +
                                    "For SQL's list type '3' \n" +
                                    "For Python's list type '4' ");
                    int studentPerCourseList = sc.nextInt();
                    switch (studentPerCourseList) {
                        case 1:
                            System.out.println(javaStudents);
                            break;
                        case 2:
                            System.out.println(cSharpStudents);
                            break;
                        case 3:
                            System.out.println(sqlStudents);
                            break;
                        case 4:
                            System.out.println(pythonStudents);
                            break;
                    }
                    break;
                case 7:

                    break;
                case 8:
                    prog = false;
                    break;
            }
        }
    }
}