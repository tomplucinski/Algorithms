import java.util.HashMap;
import java.util.Set;

public class PalindromePermutations {

    public static boolean hasPalindromePermutation(String theString) {
        Set<Character> uppairedCharacters = new HashSet<>();

        for (int  i = 0; i < theString.length(); i++) {
            char currentChar = theString.charAt(i);

            if (uppairedCharacters.contains(currentChar)) {
                uppairedCharacters.remove(currentChar);
            } else {
                uppairedCharacters.add(currentChar);
            }
        }

        return uppairedCharacters.size() <= 1;
    }
}
