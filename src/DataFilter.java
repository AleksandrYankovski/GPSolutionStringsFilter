

import java.util.ArrayList;
import java.util.List;

public class DataFilter {


    private List<String> orguments;
    private List<String> inputStrings;
    private DataParser dataParser;

    public DataFilter(List<String> orguments, List<String> inputStrings) {
        this.orguments = orguments;
        this.inputStrings = inputStrings;
        this.dataParser = new DataParser();

    }


    public List<String> filtrate() {
        List<List<String>> parserStrings = dataParser.parseStrings(inputStrings);

        List<String> result = new ArrayList<>();

        for (int i = 0; i < parserStrings.size(); i++) {
            for (String argument : orguments) {
                boolean bool = false;
                for (String word : parserStrings.get(i)) {
                    if (DataValidator.validate(argument, word)) {
                        result.add(inputStrings.get(i));
                        bool = true;
                        break;
                    }
                }
                if (bool)
                break;

            }
        }

        return result;
    }
}
