package main.dao;

import main.model.Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateTrainer {

    public static List<Trainer> trainers = new ArrayList<>();

    public static Object staticTrainers() {
        Trainer trainer1 = new Trainer("Giwrgos", "Chalkias");
        Trainer trainer2 = new Trainer("Vaggelis", "Aristopoulos");
        trainers.add(trainer1);
        trainers.add(trainer2);

        return trainers;
    }

    public static void trainerCreation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter trainer's first name:");
        String firstName = input.nextLine();

        System.out.println("Enter trainer's last name:");
        String lastName = input.nextLine();

        trainers.add(new Trainer(firstName, lastName));

    }


}
