public class Client {
    public static void main(String[] args) {
        Imposter_adapter imposter_adapter = new Imposter_adapter();
        System.out.println("Before calling adapter :");
        Crewmate crewmate = new Crewmate();
        System.out.println("Crewmate : "+crewmate.doTask());
        Imposter imposter = new Imposter();
        System.out.println("Imposter : "+imposter.doTask());

        System.out.println("After calling adapter :");
        System.out.println(imposter_adapter.avoidSuspicion(imposter));
    }
}
