package main.services;

import main.model.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainerPerCourse {

    public static List<Trainer> oopTrainers = new ArrayList<>();
    public static List<Trainer> dbTrainers = new ArrayList<>();

    public static void splitCourse(String firstName, String lastName) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the courses that the student will join with comma seperated (like this: a, b, c)");
        String courseTile = input.nextLine();
        List<String> TrainerPerCourseList = Stream.of(courseTile.split(",", -1)).collect(Collectors.toList());

        for (int i=0; i< TrainerPerCourseList.size(); i++){
            if (TrainerPerCourseList.get(i) == "Java") {
                oopTrainers.add(new Trainer(firstName, lastName));
            } else if (TrainerPerCourseList.get(i) == "C#") {
                dbTrainers.add(new Trainer(firstName, lastName));
            }
        }

    }

}
