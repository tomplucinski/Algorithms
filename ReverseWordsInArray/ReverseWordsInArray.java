public class ReverseWordsInArray {

    public static List<String> reverseWords(char[] message) {

        List<String> words = createListOfWords(message);

        int firstIndex = 0;
        int lastIndex = words.size()-1;
        String first;
        String last;

        while(firstIndex < lastIndex) {
            first = words.get(firstIndex);
            last = words.get(lastIndex);
            words.set(firstIndex, last);
            words.set(lastIndex, first);

            firstIndex++;
            lastIndex--;
        }

        return words;
    }

    private static List<String> createListOfWords(char[] message) {
        List<String> listOfWords = new ArrayList<>();
        String word = "";

        for (int i = 0; i < message.length; i++) {
            String letter = String.valueOf(message[i]);

            if (!letter.equals(" ")) {
                word += letter;
            } else {
                listOfWords.add(word);
                word = "";
            }

            if (i == message.length-1) {
                listOfWords.add(word);
            }
        }

        return listOfWords;
    }
}
