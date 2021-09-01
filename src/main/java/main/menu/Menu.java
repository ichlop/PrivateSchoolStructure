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
import static main.services.TrainerPerCourse.dbTrainers;
import static main.services.TrainerPerCourse.oopTrainers;

public class Menu {

    public static void mainMenu() {
        StudentRepository sr = new StudentRepository();
        sr.createSomething();
        TrainerRepository tr = new TrainerRepository();
        tr.createSomething();
        AssignmentRepository ar = new AssignmentRepository();
        ar.createSomething();
        CourseRepository cr = new CourseRepository();
        cr.createSomething();

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
                            "Type '7' to see the trainers for each course\n" +
                            "Type '8' to exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

                    sr.somethingCreation();
                    break;
                case 2:

                    sr.deleteSomething();
                    break;
                case 3:
                    tr.somethingCreation();

                    break;
                case 4:
                    tr.deleteSomething();
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
                            "For OOP's trainer list type '1' \n" +
                                    "For DB's trainer list type '2'");
                    int studentPerCourseList = sc.nextInt();
                    switch (studentPerCourseList) {
                        case 1:
                            System.out.println(oopTrainers);
                            break;
                        case 2:
                            System.out.println(dbTrainers);
                            break;
                    }
                    break;
                case 7:
                    System.out.println(
                            "For Java's list type '1' \n" +
                                    "For C#'s list type '2' \n" +
                                    "For SQL's list type '3' \n" +
                                    "For Python's list type '4' ");
                    int trainerPerCourseList = sc.nextInt();
                    switch (trainerPerCourseList) {
                        case 1:
                            System.out.println();
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
                case 8:
                    prog = false;
                    break;
            }
        }
    }
}