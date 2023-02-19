public class Morse {
    private static final char[]  letter = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z' };
    private final static String[] code
            = { "*-",   "-***", "-*-*", "-**",  "*",
            "**-*", "--*",  "****", "**",   "*---",
            "-*-",  "*-**", "--",   "-*",   "---",
            "*--*", "--*-", "*-*",  "***",  "-",
            "**-",  "***-", "*--",  "-**-", "-*--",
            "--**" };

    public Morse() {
    }

    public String toMorseCode(String message){
        StringBuilder morse = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < code.length; j++) {
                if (message.charAt(i) == letter[j]) {
                    morse.append(code[j]).append(" ");
                }
            }
        }
        return morse.toString();
    }
    public String morseToEnglish(String message) {
        StringBuilder english = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < code.length; j++) {
                if (message.substring(i, i + 1).equals(code[j])) {
                    english.append((char) (j + 'a')).append(" ");
                }
            }
        }
        return english.toString();
    }
}
