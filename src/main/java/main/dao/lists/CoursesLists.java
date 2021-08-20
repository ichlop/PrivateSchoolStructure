package main.dao.lists;

import main.model.Student;

import java.util.ArrayList;
import java.util.List;

import static main.dao.CreateStudent.students;

public class CoursesLists {
    public static List studentsPerCourse(String stream) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse().getStream().equals(stream)) {
                studentList.add(student);
                System.out.println(studentList);
//            } else if (student.getCourse().getStream().equals("C#")) {
//                studentList.add(student);
//                System.out.println(studentList);
//            } else if (student.getCourse().getStream().equals("SQL")) {
//                studentList.add(student);
//                System.out.println(studentList);
//            } else if (student.getCourse().getStream().equals("Python")) {
//                studentList.add(student);
//                System.out.println(studentList);
            }
        }
//        Map<String, String> cSharpStudents = (Map<String, String>) students.stream().filter(st->st.getCourse().getStream().equals("C#")).collect(Collectors.toList());
//        Map<String, String> sqlStudents = (Map<String, String>) students.stream().filter(st->st.getCourse().getStream().equals("SQL")).collect(Collectors.toList());
//        Map<String, String> pythonStudents = (Map<String, String>) students.stream().filter(st->st.getCourse().getStream().equals("Python")).collect(Collectors.toList());

        return studentList;
    }
}
