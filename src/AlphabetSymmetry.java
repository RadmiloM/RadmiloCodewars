import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AlphabetSymmetry {
    /*
    Problem description:
    Given an array of words, return an array of the number of letters that occupy their positions in the alphabet for each word. For example,
     */
    public static int[] solve(String[] arr) {
        //1.Validate input data -> check if array is not null or empty
        //2.Create HashMap from the interface map where the key will be character and the value it's position in alphabet
        //3.Add key as character from a - z and values as numbers from 1 to 26;
        //4.Create variable counter that will store each position of the alphabet starting from 1
        //5.Create for loop that will go from a to z and on each iteration add key in map as character and value as counter value
        //6.Increment the counter
        //7.Create variable that will store how many digits are in the right position
        //8.Create array that will have same length as provided array
        //9.Iterate over array of words
        //10.Store the current word in variable and convert it to lowercase
        //11. reset variable for counting how many digits are on the right place
        //11.Iterate over the word and check if the position of the current character is equal to position of index + 1
        //12.If that is the case increment the variable which counts how many numbers are on the right position
        //13.In the new array store the maximum position
        //14.Repeat the process

        if (arr == null || arr.length == 0) return new int[]{};

        Map<Character, Integer> alphabet = new HashMap<>();
        int counter = 1;
        int maximumOnTheRightPosition = 0;
        int[] result = new int[arr.length];

        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.put(c, counter++);
        }

        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i].toLowerCase();
            maximumOnTheRightPosition = 0;
            for (int j = 0; j < currentWord.length(); j++) {
                if (alphabet.get(currentWord.charAt(j)) == j + 1) {
                    maximumOnTheRightPosition++;
                }
            }
            result[i] = maximumOnTheRightPosition;
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(solve(new String[]{"abode", "ABc", "xyzD"}));
        System.out.println(solve(new String[]{"abide", "ABc", "xyz"}));
        System.out.println(solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}));
        System.out.println(solve(new String[]{"encode", "abc", "xyzD", "ABmD"}));
    }
}
