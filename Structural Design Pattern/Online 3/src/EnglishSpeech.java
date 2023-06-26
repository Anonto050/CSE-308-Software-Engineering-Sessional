public class EnglishSpeech {
    String speech;

    public EnglishSpeech(String speech) {
        this.speech = speech;
    }

    public void speak() {
        System.out.println("English: " + speech);
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getSpeech() {
        return speech;
    }

}
