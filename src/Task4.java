import java.util.Arrays;

public class Task4 {

    public static int getHighestNumberInFamily(int number) {
        StringBuilder returnedNumberAsString = new StringBuilder();
        char[] charactersInNumber = String.valueOf(number).toCharArray();

        Arrays.sort(charactersInNumber);
        for (char character : charactersInNumber) {
            returnedNumberAsString.append(character);
        }

        returnedNumberAsString.reverse();
        return Integer.parseInt(returnedNumberAsString.toString());
    }
}
