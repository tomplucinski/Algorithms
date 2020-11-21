public class TopScores {

    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        int[] scoreCounts = new int[highestPossibleScore + 1];

        for (int score : unorderedScores) {
            scoreCounts[score]++;
        }

        int[] sortedScores = new int[unorderedScores.length];
        int currentSortedIndex = 0;

        for (int score = highestPossibleScore; score >= 0; score--) {
            int count = scoreCounts[score];

            for (int occurrence = 0; occurrence < count; occurrence++) {
                sortedScores[currentSortedIndex] = score;
                currentSortedIndex++;
            }
        }

        return sortedScores;
    }
}
