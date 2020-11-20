Write a method that takes:

an array of unsortedScores
the highestPossibleScore in the game
and returns a sorted array of scores in less than O(n lg n) time.

For example:

int[] unsortedScores = {37, 89, 41, 65, 91, 53};
  
final int HIGHEST_POSSIBLE_SCORE = 100;

int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);

sortedScores: [91, 89, 65, 53, 41, 37]

Java
We’re defining n as the number of unsortedScores because we’re expecting the number of players to keep climbing.