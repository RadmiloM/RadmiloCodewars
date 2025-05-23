public class MostDigits {

    /*
    Problem description:
    Find the number with the most digits.
    If two numbers in the argument array have the same number of digits, return the first one in the array.
     */
    public static int findLongest(int[] numbers) {
        //1. Validate input data
        //2. create number that will store current maximum of the digits
        //3. Iterate over array and on each iteration first convert current maximumDigits to String
        //4. Convert each number from negative to positive number
        //5. Check if the length of the number on i-th place is greater then length of the current maximum
        //6. If that is the case new maximum is the the number with more digits
        //7. return maximumDigits

        int maximumDigits = 0;
        if (numbers == null || numbers.length == 0) return -1;
        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(Math.abs(numbers[i])).length() > String.valueOf(Math.abs(maximumDigits)).length()) {
                maximumDigits = numbers[i];
            }
        }

        return maximumDigits;


    }

    public static void main(String[] args) {
        System.out.println(findLongest(new int[]{1, 10, 100}));
        System.out.println(findLongest(new int[]{9000, 8, 800, 8000}));
    }
}
