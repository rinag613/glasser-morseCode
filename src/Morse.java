public class Morse {
    private String message;
    static char[]  letter = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z' };
    private static String[] code
            = { "*-",   "-***", "-*-*", "-**",  "*",
            "**-*", "--*",  "****", "**",   "*---",
            "-*-",  "*-**", "--",   "-*",   "---",
            "*--*", "--*-", "*-*",  "***",  "-",
            "**-",  "***-", "*--",  "-**-", "-*--",
            "--**" };

    public Morse(String message) {
        this.message = message;
    }

    public String toMorseCode(){
        String morse = "";
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < code.length; j++) {
                if (message.charAt(i) == letter[j]) {
                    morse = morse + code[j] + " ";
                }
            }
        }
        return morse;
    }
    public String morseToEnglish() {
        String english = "";

        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < code.length; j++) {
                if (message.substring(i, i + 1).equals(code[j])) {
                    english = english + (char) (j + 'a') + " ";
                }
            }
        }
        return english;
    }
}
