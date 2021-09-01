package main.dao;

import main.dao.implement.DaoRepository;
import main.model.Student;
import main.model.Trainer;
import main.services.TrainerPerCourse;
import main.services.Validations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainerRepository implements DaoRepository {

    public static List<Trainer> trainers = new ArrayList<>();

    @Override
    public List<Trainer> createPerson() {
        Trainer trainer1 = new Trainer("Giorgos", "Chalkias");
        Trainer trainer2 = new Trainer("Giannis", "Antetokoumbo");
        trainers.add(trainer1);
        trainers.add(trainer2);

        return trainers;
    }

    @Override
    public void personCreation() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter trainer's first name:");
        String firstName = null;
        firstName = Validations.nameValidation(firstName, input);

        System.out.println("Enter trainer's last name:");
        String lastName = null;
        lastName = Validations.nameValidation(lastName, input);

        trainers.add(new Trainer(firstName, lastName));

        TrainerPerCourse.splitCourse(firstName, lastName);

    }

    @Override
    public void deletePerson() {
        System.out.println("Give the firstname and the last name of the trainer you want to delete");

        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        String lname = sc.nextLine();

        trainers.remove(new Student(fname, lname));
    }
}
