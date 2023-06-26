public class Imposter {
    public String task;
    public String deception;
    //constructor
    public Imposter() {
        task = "Hi! I'm imposter. I do sabotage voyage";
        deception = "I'm crewmate like you guys. I do maintenance task too";
    }

    public String doTask() {
        return task;
    }

    public void setDeception(String deception) {
        this.deception = deception;
    }

    public String getDeception() {
        return deception;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
}
