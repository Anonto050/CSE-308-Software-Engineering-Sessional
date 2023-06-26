package ExamPerson;

import Mediator.*;

public abstract class ExamPerson {
    public int id;
    public Script script;
    protected Mediator mediator;

    public ExamPerson(Mediator mediator){
        this.mediator = mediator;
    }
}
