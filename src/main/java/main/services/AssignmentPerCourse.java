package main.services;

import main.model.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignmentPerCourse {

    public static List<Assignment> javaAssignments = new ArrayList<>();
    public static List<Assignment> cSharpAssignments = new ArrayList<>();
    public static List<Assignment> sqlAssignments = new ArrayList<>();
    public static List<Assignment> pythonAssignments = new ArrayList<>();

    public static void splitCourse(String title, String description, String subDate, double oralMark, double totalMark) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the courses that the assignment will be (like this: a, b, c)");
        String courseStream = input.nextLine();
        String[] sp = courseStream.split(", ");
        List<String> assignmentPerCourseList = new ArrayList<>();
        for (int i = 0; i < sp.length; i++) {
            assignmentPerCourseList.add(sp[i]);
        }

        for (String str : assignmentPerCourseList) {
            if (str.equals("Java")) {
                javaAssignments.add(new Assignment(title, description, subDate, oralMark, totalMark));
            } else if (str.equals("C#")) {
                cSharpAssignments.add(new Assignment(title, description, subDate, oralMark, totalMark));
            } else if (str.equals("SQL")) {
                sqlAssignments.add(new Assignment(title, description, subDate, oralMark, totalMark));
            } else if (str.equals("Python")) {
                pythonAssignments.add(new Assignment(title, description, subDate, oralMark, totalMark));
            }
        }
    }
}



