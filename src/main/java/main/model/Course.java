package main.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String title;
    private String stream;
    private CourseType type;
    private String startDate;
    private String endDate;

    private List<Student> students;
    private List<Trainer> trainers;

    public Course(String title, String stream, CourseType type, String startDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = new ArrayList<>();
        this.trainers = new ArrayList<>();
    }

    public Course(String title, String stream, CourseType type, String startDate, String endDate, List<Student> students) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.students = students;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "\n Course{" +
                "title='" + title + '\'' +
                ", stream='" + stream + '\'' +
                ", type=" + type +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", students=" + students +
                ", trainers=" + trainers +
                '}';
    }
}