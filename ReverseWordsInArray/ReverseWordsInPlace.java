public class ReverseWordsInPlace {
    
    public static void reverseWords(char[] message) {

        reverseCharacters(message, 0, message.length - 1);

        int currentWordStartIndex = 0;
        for (int i = 0; i <= message.length; i++) {

            if (i == message.length || message[i] == ' ') {
                reverseCharacters(message, currentWordStartIndex, i - 1);
                currentWordStartIndex = i + 1;
            }
        }
    }

    private static void reverseCharacters(char[] message, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}