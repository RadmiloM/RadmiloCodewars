import java.util.Arrays;

public class ProductArray {
    /*
    Problem description:
    Given an array/list [] of integers ,
    Construct a product array Of same size Such
    That prod[i] is equal to The Product of all the elements of Arr[] except Arr[i].
     */
    public static long[] productArray(int[] numbers) {
        //1. Validate input data check if numbers is not null or empty
        //2. Check if size is two if that is the case first return second number then return first
        //3. Create long array which will be the size of the numbers
        //4. Create counter variable which will position numbers multiplied on right positions in resulting array
        //5. Create for loop one which will go from first to last element
        //6. Create product variable and initialize value to 1
        //7. Create other for loop inside outer for loop which will go from last to first element
        //8. The one on the right on each iteration multiply with product
        //9. If the current position is different from position of variable in outer loop multiply that number if it is the same do nothing
        //10. return result array;

        if(numbers == null || numbers.length == 0) return new long[]{};
        long[] result = new long[numbers.length];
        int counter = 0;
        for(int i =0; i < numbers.length;i++) {
            long product = 1;
            for(int j = numbers.length - 1; j >=0; j--){
                if(j != i) {
                    product*=numbers[j];
                }
            }
            result[counter++] = product;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

}
