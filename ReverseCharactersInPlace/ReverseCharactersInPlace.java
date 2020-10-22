import java.util.*;

public class ReverseCharactersInPlace {

    public static char[] reverse(char[] arrayOfChars) {

        int leftIndex = 0;
        int rightIndex = arrayOfChars.length-1;

        while (leftIndex < rightIndex) {
            char temp = arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
            arrayOfChars[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return arrayOfChars;
    }
}
