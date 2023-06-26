public class Imposter_adapter extends Imposter {
    public Maintenance_task maintenance_task;
    public Imposter imposter;

    public Imposter_adapter() {
        maintenance_task = new Maintenance_task();
        imposter = new Imposter();
    }

    public String avoidSuspicion(Imposter imp) {
        imposter = imp;
        Crewmate crewmate = new Crewmate();
        crewmate.setTask(imposter.getDeception());
        return maintenance_task.avoidSuspicion(crewmate);
    }
}
