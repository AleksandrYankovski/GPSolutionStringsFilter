

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class DataValidator {

    public static boolean validate(String argument, String wordValueInStrok) {

        boolean bool = false;
        try {
            bool = Pattern.matches(argument, wordValueInStrok);
        } catch (PatternSyntaxException e) {
            bool = argument.equals(wordValueInStrok);
        }

        return wordValueInStrok != null && argument != null && bool;
    }
}
