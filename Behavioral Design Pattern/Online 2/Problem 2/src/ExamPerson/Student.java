package ExamPerson;

import Mediator.*;

public class Student extends ExamPerson {
    public Student(Mediator mediator, int id) {
        super(mediator);
        this.id = id;
    }

    public void printIndividualMarks(Script script){
        System.out.println("Student " + id + ", individual marks : " + script.getMarks());
        this.script = script;
    }

    public void reexamineRequest(){
        System.out.println("Student " + id + " reexamine request");
        mediator.publish(this);
    }
}

