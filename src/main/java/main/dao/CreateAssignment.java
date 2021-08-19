package main.dao;

import main.model.Assignment;

import java.util.Arrays;
import java.util.List;

public class CreateAssignment {

    public static List<Assignment> assignmentCreation(){

        Assignment assignment1 = new Assignment("Individual Project A", "Make a program with getters and setters", "20/08/2021", 9.6, 9.7);
        Assignment assignment2 = new Assignment("Individual Project B", "Make a program with constructors", "20/010/2021", 9.0, 9.2);
        Assignment assignment3 = new Assignment("Individual Project C", "Make a program and create objects", "10/11/2021", 9.6, 9.0);
        Assignment assignment4 = new Assignment("Individual Project D", "Make a program and connect with DB", "15/11/2021", 8.4, 9.7);
        Assignment assignment5 = new Assignment("Individual Project E", "Make a program for sale", "30/11/2021", 7.7, 9.7);
        Assignment assignment6 = new Assignment("Team Project A", "Make a program with getters and setters", "10/12/2021", 8.2, 9.1);
        Assignment assignment7 = new Assignment("Team Project B", "Make a program with getters and setters", "01/01/2022", 8.6, 9.6);

        List<Assignment> assignments = Arrays.asList(assignment1, assignment2, assignment3, assignment4, assignment5, assignment6, assignment7);


        return assignments;
    }
}
