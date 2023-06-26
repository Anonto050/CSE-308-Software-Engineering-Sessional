package Main;

import ExamPerson.*;
import Mediator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter the number of teachers");
        int numberOfTeachers = scanner.nextInt();

        ExamController examController = new ExamController();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        for(int i = 0; i < numberOfStudents; i++){
            Student student = new Student(examController, i);
            students.add(student);
            examController.addStudent(student);
        }

        for(int i = 0; i < numberOfTeachers; i++){
            Teacher teacher = new Teacher(examController, i);
            teachers.add(teacher);
            examController.addTeacher(teacher);
        }

        System.out.println("Which teacher should examine?");
        int teacherId = scanner.nextInt();
        teachers.get(teacherId).publishMarks(students);

        while(true) {
            System.out.println("Which student wants to reexamine?");
            int studentId = scanner.nextInt();
            if(studentId == -1){
                break;
            }
            students.get(studentId).reexamineRequest();
        }

    }
}
