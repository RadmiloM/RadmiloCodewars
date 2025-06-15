import java.util.ArrayList;
import java.util.List;

public class VowelMapper {
    /*
    Given an array of numbers,
    check if any of the numbers are the character codes for lower case vowels (a, e, i, o, u).
     */
    public static List<Object> isVow(List<Integer> a) {
        //1. Validate input data check if given list is not empty or null
        //2. Create array list and add vowels
        //3. Create new list with generic Object type
        //4. Iterate over given list and check if the given number converted to character is vowel
        //5. Before the check convert Integer boxed type of int back to int since char does not work with wrappers Integer
        //6. Check if the given list contains the given character if that is the case add to generic list
        //7. If it is not vowel simply  add number to generic list
        //8. Return generic list
        if (a == null || a.size() == 0) return new ArrayList<>() {
        };
        List<String> vowels = new ArrayList<>(List.of("a", "e", "i", "o", "u"));
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int currentNumber = a.get(i);
            char ch = (char) currentNumber;
            if (vowels.contains(String.valueOf(ch))) {
                result.add(String.valueOf(ch));
            } else {
                result.add(currentNumber);
            }
        }
        return result;
    }
}
