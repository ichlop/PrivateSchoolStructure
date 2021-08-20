package main.menu;

import main.dao.CreateAssignment;
import main.dao.CreateCourse;
import main.dao.CreateStudent;
import main.dao.CreateTrainer;
import main.dao.lists.CoursesLists;

import java.util.Scanner;

import static main.dao.CreateStudent.students;
import static main.dao.CreateTrainer.trainers;

public class Menu {

    public static void mainMenu() {

        System.out.println("-----------------------------");
        System.out.println("This is a Private School menu");
        System.out.println("-----------------------------");
        System.out.println(
                "Type '1' to add a new student \n" +
                        "Type '2' to add a new trainer \n" +
                        "Type '3' to choose what list you want to see \n" +
                        "Type '4' to see the students for each course");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                CreateStudent.studentCreation();

                mainMenu();
            case 2:
                CreateTrainer.trainerCreation();

                mainMenu();
            case 3:
                System.out.println(
                        "For student's list type 1 \n" +
                                "For trainer's list type 2 \n" +
                                "For assignment's list type 3 \n" +
                                "For course's list type 4");
                int choiceList = sc.nextInt();
                switch (choiceList) {
                    case 1:
                        CreateStudent.staticStudents();
                        System.out.println(students);

                        break;
                    case 2:
                        CreateTrainer.staticTrainers();
                        System.out.println(trainers);

                        break;
                    case 3:
                        System.out.println(CreateAssignment.assignmentCreation());

                        break;
                    case 4:
                        System.out.println(CreateCourse.courseCreation());

                        break;
                    default:
                        mainMenu();
                }
                mainMenu();
            case 4:
                System.out.println(
                        "For Java's list type 1 \n" +
                                "For C#'s list type 2 \n" +
                                "For SQL's list type 3 \n" +
                                "For Python's list type 4");
                int studentPerCourseList = sc.nextInt();
                switch (studentPerCourseList) {
                    case 1:
                        System.out.println(CoursesLists.studentsPerCourse("Java"));

                        break;
                    case 2:
                        System.out.println(CoursesLists.studentsPerCourse("C#"));

                        break;
                    case 3:
                        System.out.println(CoursesLists.studentsPerCourse("SQL"));

                        break;
                    case 4:
                        System.out.println(CoursesLists.studentsPerCourse("Python"));

                        break;
                    default:
                        mainMenu();
                }

                default:
                mainMenu();
        }
    }
}
