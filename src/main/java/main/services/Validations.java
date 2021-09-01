package main.services;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Validations {


    public static int feeValidation(int tuition, Scanner input) {
        do {
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                input.next();
            }
            return tuition = input.nextInt();
        } while (tuition <= 0 || tuition > 4000);
    }

    public static double oralValidation(double mark, Scanner input) {
        do {
            while (!input.hasNextInt()) {
                System.out.println("That's not a valid number!");
                input.next();
            }
            return mark = input.nextInt();
        } while (mark < 0.0 || mark > 10);
    }

    public static void dateValidation(String date, Scanner input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean vd = true;
        while (vd) {
            try {
                formatter.parse(date);
                vd = false;
            } catch (Exception e) {
                System.out.println("Please enter a valid date:");
                date = input.nextLine();
            }
        }
    }

    public static String stringValidation(String name, Scanner input) {

        while (!input.hasNext("[A-Za-z]*")) {
            System.out.println("Please Enter a Valid name:");
            name = input.nextLine();
        }
        return name = input.nextLine();
    }
}
