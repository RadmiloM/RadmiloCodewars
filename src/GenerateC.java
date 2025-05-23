public class GenerateC {
    /*
    Problem desription:
    Build a string representing a capital letter C of a given size out of 'C' characters.
     */
    public static String generateC(int size) {
        //1.Validate input data check if string is not less then 1
        //2.Create String builder that will store the final string and assign empty string
        //3.Start for loop from 0 to size
        //4.On each iteration add C size times five plus new line
        //5.Next iterate from 3 times size and on each iteration add C repeated size times plus new line
        //6.Finally iterate from 0 to overall size minus three times size minus size and add C repeated five times
        //7. Return result from builder converted to string
        if (size <= 0) return "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append("C".repeat(size * 5)).append("\n");
        }
        int middle = size * 3;
        for (int i = 0; i < middle; i++) {
            result.append("C".repeat(size)).append("\n");
        }
        int lastPart = size * 5 - size * 3 - size;
        for (int i = 0; i < lastPart; i++) {
            result.append("C".repeat(size * 5)).append("\n");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(generateC(1));
        System.out.println(generateC(2));
    }
}
