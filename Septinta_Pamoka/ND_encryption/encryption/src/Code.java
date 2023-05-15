import java.util.Collections;

public class Code {
    public String deCodeWork(String input) {
        String outputString = "";
        Collections.shuffle(charStringShuffle, rn);

        for (char charChar : input.toCharArray()) {
            int replace = charStringShuffle.indexOf(charChar);
            outputString = outputString + charString.get(replace);
        }
        return outputString;
    }

    public String enCodeWork(String input) {
        String outputString = "";

        Collections.shuffle(charStringShuffle, rn);

        for (char charChar : input.toCharArray()) {
            int replace = charString.indexOf(charChar);
            outputString = outputString + charStringShuffle.get(replace);
        }
        return outputString;
    }
}
