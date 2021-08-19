package main;


import main.dao.CreateAssignment;
import main.dao.CreateCourse;
import main.dao.CreateStudent;
import main.dao.CreateTrainer;

import java.util.Scanner;

import static main.dao.CreateStudent.students;
import static main.dao.CreateTrainer.trainers;

public class PrivateSchool {

    public static void main(String[] args) {


        System.out.println("This is a Private School menu");
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

                break;
            case 2:
                CreateTrainer.trainerCreation();

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
                        break;
                }
                break;
            case 4:

                break;
            default:

        }

    }

}
//todo: when i create a student/trainer(1,2) to pass him on students/trainers(3.1,3.2).
//todo: connect courses with students