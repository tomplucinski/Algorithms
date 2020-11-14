public class InFlightentertainment {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
        Set<Integer> set = new HashSet<>();

        for (int firstMovieLength : movieLengths) {
            int matchingSecondMovieLength = flightLength - firstMovieLength;
            if (set.contains(matchingSecondMovieLength)) {
                return true;
            }
            set.add(firstMovieLength);
        }

        return false;
    }
}