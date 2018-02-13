

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataParser {




    public List<List<String>> parseStrings(List<String> stringtList) {
        List<List<String>> parserStrings = new ArrayList<>();

        for (String stroka : stringtList) {

            stroka = this.refactor(stroka);
            StringTokenizer stringTokenizer = new StringTokenizer(stroka);
            List<String> wordsInString = new ArrayList<>();
            while (stringTokenizer.hasMoreTokens()) {
                wordsInString.add(stringTokenizer.nextToken());
            }
            parserStrings.add(wordsInString);

        }
        return parserStrings;
    }

    private String refactor(String string) {
        return string.substring(0, string.length() - 1);
    }
}
