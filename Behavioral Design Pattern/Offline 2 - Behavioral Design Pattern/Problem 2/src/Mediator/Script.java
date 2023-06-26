package Mediator;

public class Script {
    public int marks;
    public int studentId;
    public int teacherId;

    public Script(int marks, int studentId, int teacherId){
        this.marks = marks;
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

    public int getMarks() {
        return marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
