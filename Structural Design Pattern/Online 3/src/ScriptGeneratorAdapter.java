public class ScriptGeneratorAdapter {
    ScriptGenerator scriptGenerator;
    BanglaSpeech banglaSpeech;

    public ScriptGeneratorAdapter(BanglaSpeech banglaSpeech) {
        this.banglaSpeech = banglaSpeech;
        //remove the quotation marks from the speech
        //String speech = banglaSpeech.getSpeech().replaceAll("\"", "");
        //scriptGenerator = new ScriptGenerator(banglaSpeech);
    }



    public void generateScript() {
        //You may safely assume that, in this evaluation, you only have to translate the following
        //Bangla words.
        //○ Ami (I), Amra(We), Bhat(Rice), Roti(Bread), Khai(Eat), and Banai(Prepare).
        //convert the bangla speech to english speech
        String speech = banglaSpeech.getSpeech();
        speech = speech.replaceAll("Ami", "I");
        speech = speech.replaceAll("Amra", "We");
        speech = speech.replaceAll("Bhat", "Rice");
        speech = speech.replaceAll("Roti", "Bread");
        speech = speech.replaceAll("Khai", "Eat");
        speech = speech.replaceAll("Banai", "Prepare");
        //System.out.println(speech);

        //generate the script
        EnglishSpeech englishSpeech = new EnglishSpeech(speech);
        scriptGenerator = new ScriptGenerator(englishSpeech);
        scriptGenerator.generateScript();
    }
}
