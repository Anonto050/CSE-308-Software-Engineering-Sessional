public class ScriptGenerator {
    EnglishSpeech englishSpeech;

    public ScriptGenerator(EnglishSpeech englishSpeech) {
        this.englishSpeech = englishSpeech;
    }

    public void generateScript() {
        //remove the quotation marks from the speech
        String speech = englishSpeech.getSpeech().replaceAll("\"", "");
        //print the speech
        System.out.println(speech);
    }
}
