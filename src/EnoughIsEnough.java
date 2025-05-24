import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {
    /*
    Problem description:
    Given a list and a number, create a new list that contains each number of list at most N times, without reordering.
     */
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //1. Validate input data check if elements are not null or empty
        //2. Create hashMap to store keys and values
        //3. Create list that will store only numbers which are in the range of maximum occurences
        //4. Iterate over elements and on each iteration in the hash map call merge function
        //5. Merge function will recalculate how many times number appears in the range
        //6. set key as current value, set value as one as starting point and call method reference on sum function
        //7. On each iteration recalculate the number of times number appears and store it to the frequence array
        //8. In the end convert list to array
        if(elements == null || elements.length == 0) return new int[] {};
        Map<Integer, Integer> numberOfOccurrences = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int number : elements) {
            int frequence = numberOfOccurrences.merge(number, 1, Integer::sum);
            if (frequence <= maxOccurrences) {
                result.add(number);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

        System.out.println(deleteNth(new int[]{20, 37, 20, 21}, 1));
        System.out.println(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3));
        System.out.println(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3));
        // [1,2,1] 1 -> [1,2]
    }
}
