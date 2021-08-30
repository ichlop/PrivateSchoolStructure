package main.menu;

import main.dao.AssignmentRepository;
import main.dao.CourseRepository;
import main.dao.StudentRepository;
import main.dao.TrainerRepository;

import java.util.Scanner;

import static main.dao.AssignmentRepository.assignments;
import static main.dao.CourseRepository.courses;
import static main.dao.StudentRepository.students;
import static main.dao.TrainerRepository.trainers;
import static main.services.StudentPerCourse.*;

public class Menu {

    public static void mainMenu() {
        StudentRepository.createStudents();
        TrainerRepository.createTrainers();
        AssignmentRepository.assignmentCreation();
        CourseRepository.createCourses();

        while (true) {

            System.out.println("-----------------------------");
            System.out.println("This is a Private School menu");
            System.out.println("-----------------------------");
            System.out.println(
                    "Type '1' to add a new student \n" +
                            "Type '2' to add a new trainer \n" +
                            "Type '3' to choose what list you want to see \n" +
                            "Type '4' to see the students for each course\n" +
                            "Type '5' and type the date to see students that owe submissions");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    StudentRepository.studentCreation();

                    break;
                case 2:
                    TrainerRepository.trainerCreation();

                    break;
                case 3:
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
                case 4:
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
                case 5:

                    break;
            }
        }
    }
}