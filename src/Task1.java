public class Task1 {
    public static String writeStringForgivenInt(int number) {
        StringBuilder returnedText = new StringBuilder();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                returnedText.append("+");
            } else {
                returnedText.append("-");
            }
        }
        return returnedText.toString();
    }
}
