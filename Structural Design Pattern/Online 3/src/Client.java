import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speech:");
        String speech = scanner.nextLine();

        //remove the quotation marks from the speech
        speech = speech.replaceAll("\"", "");


        //check if the speech is in bangla
        //check if string contains - Ami, Amra, Bhat, Roti, Khai, and Banai
        if (speech.contains("Ami") || speech.contains("Amra") || speech.contains("Bhat") || speech.contains("Roti") || speech.contains("Khai") || speech.contains("Banai")) {
            BanglaSpeech banglaSpeech = new BanglaSpeech(speech);
            ScriptGeneratorAdapter scriptGeneratorAdapter = new ScriptGeneratorAdapter(banglaSpeech);
            scriptGeneratorAdapter.generateScript();
        } else {
            //generate the script
            EnglishSpeech englishSpeech = new EnglishSpeech(speech);
            ScriptGenerator scriptGenerator = new ScriptGenerator(englishSpeech);
            scriptGenerator.generateScript();
        }
    }
}
