public class Task3 {
    public static int[] getIntArrayForGivenInt(int number) {
        if (number < 1) return new int[1];
        if (number > 100) return new int[1];

        int[] returnedArray = new int[number];
        int arrayValuesSum = 0;

        for (int i = 0; i < number; i++) {
            returnedArray[i] = i;
            arrayValuesSum += i;
        }
        returnedArray[0] = -arrayValuesSum;
        return returnedArray;
    }
}
