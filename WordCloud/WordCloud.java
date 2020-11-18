import java.util.HashMap;
import java.util.Map;

public class WordCloud {

    public WordCloud(String input) {
        populateWordsToCounts(input);
    }

    private Map<String, Integer> wordCount = new HashMap<>();

    private void populateWordsToCounts(String inputString) {
        String[] words = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");

        for (String w : words) {
            if (!wordCount.containsKey(w)) {
                wordCount.put(w, 1);
            } else {
                wordCount.put(w, wordCount.get(w) + 1);
            }
        }
    }

    public Map<String, Integer> getWordCounts() {
        return wordCount;
    }
}
