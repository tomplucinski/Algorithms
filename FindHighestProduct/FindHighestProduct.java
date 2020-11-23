public class FindHighestProduct {

    public static int highestProductOf3(int[] arrayOfInts) {

        if (arrayOfInts.length < 3) {
            throw new IllegalArgumentException("There are less than 3 items!");
        }

        int highest = Math.max(arrayOfInts[0], arrayOfInts[1]);
        int lowest  = Math.min(arrayOfInts[0], arrayOfInts[1]);

        int highestProductOf2 = arrayOfInts[0] * arrayOfInts[1];
        int lowestProductOf2  = arrayOfInts[0] * arrayOfInts[1];
        int highestProductOf3 = arrayOfInts[0] * arrayOfInts[1] * arrayOfInts[2];

        for (int i = 2; i < arrayOfInts.length; i++) {
            int current = arrayOfInts[i];

            highestProductOf3 = Math.max(Math.max(
                    highestProductOf3,
                    current * highestProductOf2),
                    current * lowestProductOf2);

            highestProductOf2 = Math.max(Math.max(
                    highestProductOf2,
                    current * highest),
                    current * lowest);

            lowestProductOf2 = Math.min(Math.min(
                    lowestProductOf2,
                    current * highest),
                    current * lowest);

            highest = Math.max(highest, current);

            lowest = Math.min(lowest, current);
        }

        return highestProductOf3;
    }
}
