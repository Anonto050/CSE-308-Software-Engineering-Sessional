public class Maintenance_task {
    Crewmate crewmate;

    public String avoidSuspicion(Crewmate crm) {
        crewmate = crm;
        return crewmate.doTask();
    }
}
