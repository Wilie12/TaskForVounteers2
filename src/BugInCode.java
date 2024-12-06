public class BugInCode {
    public static void main(String[] args) {
        System.out.println("the sum of the numbers in the array is: "
                + calcSumArray(new int[]{7, 1, 2, 3, 4}));
    }
    public static int calcSumArray(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result += j;
        }
        return result;
    }
}
