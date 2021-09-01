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

        System.out.println("Choose the courses that the trainer will join with comma seperated (like this: a, b)");
        String courseTile = input.nextLine();
        List<String> trainerPerCourseList = Stream.of(courseTile.split(",", -1)).collect(Collectors.toList());

        for (String str : trainerPerCourseList) {
            if (str.equals("OOP") || str.equals("oop")) {
                oopTrainers.add(new Trainer(firstName, lastName));
            } else if (str.equals("DB") || str.equals("db")) {
                dbTrainers.add(new Trainer(firstName, lastName));
            }
        }
    }
}