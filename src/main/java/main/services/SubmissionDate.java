package main.services;


import main.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static main.dao.StudentRepository.students;

public class SubmissionDate {

    public static String insertedDate() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the date you want to see (like this dd/mm/yyyy):");
        String date = input.nextLine();

        return date;
    }

    public static Date convertDate() throws ParseException {

        String date = insertedDate();
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return date1;

    }

    public static void dateToSubmit() throws ParseException {

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = convertDate();
        for (Student student : students) {
            Date studentDateSubmission = sdformat.parse(student.);
            if (studentDateSubmission.compareTo(date)) {
                continue;
            }
            continue;


        }

    }

}