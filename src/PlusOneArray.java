import java.math.BigInteger;
import java.util.Arrays;

public class PlusOneArray {

    /*
    Problem description:
    Given an array of integers of any length, return an array that has 1 added to the value represented by the array.
    If the array is invalid (empty, or contains negative integers or integers with more than 1 digit), return nil (or your language's equivalent).
     */
    public static int[] upArray(final int[] arr) {
        //1.Validate input data -> check if array is null or empty
        //2.Create string builder to store each digit from the array
        //3. Iterate over array of numbers and on each iteration check if number is negative or number has more than one digit return null
        //4. In other case add to builder
        //5. Create big integer to store large number from string builder and add one to it
        //6. Convert variable which has integer back to string
        //7. Split string on empty string without spaces as delimiter
        //8. Next map each digit to integer and return sb
        System.out.println(Arrays.toString(arr));
        if (arr == null || arr.length == 0) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return null;
            } else if (String.valueOf(arr[i]).length() != 1 || String.valueOf(arr[i]).equals("-")) {
                return null;
            } else {
                sb.append(arr[i]);
            }
        }
        BigInteger bigNumber = new BigInteger(sb.toString());
        bigNumber = bigNumber.add(BigInteger.ONE);
        String[] result = String.valueOf(bigNumber).split("");
        return Arrays.stream(result).mapToInt(num -> Integer.parseInt(num)).toArray();
    }

//    public static int[] upArray(final String x) {
//        if(x.equals("-")) return null;
//        int number = Integer.parseInt(x) + 1;
//        String convertToString = String.valueOf(number);
//        String[] nums = convertToString.split("");
//        return Arrays.stream(nums).mapToInt(i -> Integer.parseInt(i)).toArray();
//    }

    public static void main(String[] args) {
//        System.out.println(upArray(new int[]{4, 3, 2, 5}));
//        System.out.println(upArray(new int[]{1, 2, 3, 9}));
//        System.out.println(upArray(new int[]{9, 9, 9, 9}));
//        System.out.println(upArray(new int[]{1, -9}));
//        System.out.println(upArray(new int[]{1, 33}));
        System.out.println(upArray(new int[]{9, 4, 2, 0, 1, 7, 8, 0, 9, 7, 7, 0, 0, 5, 8, 4, 0, 9, 9, 5, 2, 4, 8, 1, 1}));
    }
}
