package main.dao;

import main.dao.implement.DaoRepository;
import main.model.Assignment;
import main.services.AssignmentPerCourse;
import main.services.Validations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AssignmentRepository implements DaoRepository {

    public static List<Assignment> assignments = new ArrayList<>();

    @Override
    public List<Assignment> createSomething() {

        Assignment assignment1 = new Assignment("Individual Project A", "Make a program with getters and setters", "20/08/2021", 9.6, 9.7);
        Assignment assignment2 = new Assignment("Individual Project B", "Make a program with constructors", "20/010/2021", 9.0, 9.2);
        Assignment assignment3 = new Assignment("Individual Project C", "Make a program and create objects", "10/11/2021", 9.6, 9.0);
        Assignment assignment4 = new Assignment("Individual Project D", "Make a program and connect with DB", "15/11/2021", 8.4, 9.7);
        Assignment assignment5 = new Assignment("Individual Project E", "Make a program for sale", "30/11/2021", 7.7, 9.7);
        Assignment assignment6 = new Assignment("Project A", "Make an individual program with getters and setters", "10/12/2021", 8.2, 9.1);
        Assignment assignment7 = new Assignment("Project B", "Make a program with your team with getters and setters", "01/01/2022", 8.6, 9.6);

        assignments = Arrays.asList(assignment1, assignment2, assignment3, assignment4, assignment5, assignment6, assignment7);

        return assignments;
    }


    @Override
    public void somethingCreation() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter assignment's title:");
        String title = null;
        title = Validations.stringValidation(title, input);

        System.out.println("Enter assignment's description:");
        String description = null;
        description = Validations.stringValidation(description, input);

        System.out.println("Enter assignment's submission date (like this dd/mm/yyyy):");
        String subDate = input.nextLine();
        Validations.dateValidation(subDate, input);

        System.out.println("Enter assignment's oral mark");
        double oralMark = 0.0;
        oralMark = Validations.oralValidation(oralMark, input);

        System.out.println("Enter assignment's total mark");
        double totalMark = 0;
        totalMark = Validations.oralValidation(totalMark, input);

        assignments.add(new Assignment(title, description, subDate, oralMark, totalMark));

        AssignmentPerCourse.splitCourse(title, description, subDate, oralMark, totalMark);


    }

    @Override
    public void deleteSomething() {

    }
}
