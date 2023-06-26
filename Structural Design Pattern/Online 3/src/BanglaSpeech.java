public class BanglaSpeech {
    String speech;

    public BanglaSpeech(String speech) {
        this.speech = speech;
    }

    public void speak() {
        System.out.println("Bangla: " + speech);
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getSpeech() {
        return speech;
    }
}
