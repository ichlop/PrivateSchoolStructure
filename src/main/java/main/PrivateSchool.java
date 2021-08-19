package main;

import com.sun.glass.ui.Clipboard;
import main.dao.CreateAssignment;
import main.dao.CreateCourse;
import main.dao.CreateStudent;
import main.dao.CreateTrainer;
import main.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrivateSchool {

    public static void main(String[] args) {


        System.out.println("This is a Private School menu");
        System.out.println("Type '1' to add a new student \n" +
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

                break;
            case 3:
                System.out.println("For student's list type 1 \n" +
                        "For trainer's list type 2 \n" +
                        "For assignment's list type 3 \n" +
                        "For course's list type 4");
                int choiceList = sc.nextInt();
                switch (choiceList) {
                    case 1:
                        System.out.println(CreateStudent.staticStudents());

                        break;
                    case 2:
                        System.out.println(CreateTrainer.staticTrainers());

                        break;
                    case 3:
                        System.out.println(CreateAssignment.assignmentCreation());

                        break;
                    case 4:
                        System.out.println(CreateCourse.courseCreation());

                        break;
                    default:

                }
                break;
            case 4:

                break;
            default:

            }

    }

}
