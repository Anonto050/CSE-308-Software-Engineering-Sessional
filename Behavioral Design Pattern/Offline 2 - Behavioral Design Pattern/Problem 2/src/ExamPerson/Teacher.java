package ExamPerson;

import Mediator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher extends ExamPerson {

    public List<Script> scripts;

    public Teacher(Mediator mediator, int id) {
        super(mediator);
        this.id = id;
        scripts = new ArrayList<>();
    }

    public void publishMarks(List<Student> students){

        Random random = new Random();
        for(Student student : students){
            int marks = random.nextInt(100);
            Script script = new Script(marks, student.id, id);
            scripts.add(script);
        }
        System.out.println("Teacher " + id + " publishing marks");
        mediator.publish(this);
        System.out.println();
    }

    public void reexamine(Script script){
        System.out.println("Teacher " + id + " reexamining of student " + script.getStudentId());
        //correct the marks
        for(Script script1 : scripts){
            if(script1.getStudentId() == script.getStudentId()){
                script1.setMarks(script.getMarks());
            }
        }
        mediator.publish(this);
        System.out.println();
    }
}
