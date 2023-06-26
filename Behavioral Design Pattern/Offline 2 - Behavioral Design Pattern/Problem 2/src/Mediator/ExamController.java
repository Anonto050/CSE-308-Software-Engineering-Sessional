package Mediator;

import ExamPerson.*;

import java.util.ArrayList;
import java.util.List;

public class ExamController extends Mediator {

     List<Student> students;
     List<Teacher> teachers;

        public ExamController(){
            students = new ArrayList<>();
            teachers = new ArrayList<>();
        }

        public void addStudent(Student student){
            students.add(student);
        }

        public void addTeacher(Teacher teacher){
            teachers.add(teacher);
        }

        @Override
      public void publish(ExamPerson examPerson){
          if(examPerson instanceof Teacher) {
              System.out.println("Exam controller publishing marks");
                Teacher teacher = (Teacher) examPerson;
                for (Script script : teacher.scripts) {
                    System.out.println("Student : " + script.getStudentId() + ", marks : " + script.getMarks());
                }
                for(Script script : teacher.scripts){
                        students.get(script.getStudentId()).printIndividualMarks(script);
                }
              System.out.println();
          }
          else if(examPerson instanceof Student){
              System.out.println("Processing reexamine request of student " + examPerson.id);
              Student student = (Student) examPerson;
                for(Teacher teacher : teachers){
                    for(Script script : teacher.scripts){
                        if(script.getStudentId() == student.id){
                            this.reexamineProcess(teacher, script);
                        }
                    }
                }

              student.printIndividualMarks(student.script);
              System.out.println();
          }
      }

        public void reexamineProcess(Teacher teacher, Script script){
            //System.out.println("Exam controller reexamining");

            if(script.getMarks() % 2 == 0){
                System.out.println("Student Id : " + script.getStudentId() + ", previous marks : " + script.getMarks() + ", new marks : " + (script.getMarks() + 5));
                script.setMarks(script.getMarks() + 5);
            }
            else{
                System.out.println("No reexamination required for student " + script.getStudentId());
            }

            teacher.reexamine(script);
            System.out.println();
        }

}
