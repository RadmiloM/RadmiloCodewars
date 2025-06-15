public class Neutralise {
    /*
    Given two strings comprised of + and -, return a new string which shows how the two strings interact in the following way:
    When positives and positives interact, they remain positive.
    When negatives and negatives interact, they remain negative.
    But when negatives and positives interact, they become neutral, and are shown as the number 0.
     */
    public static String neutralise(String s1, String s2) {
        // 1. Validate input data check if strings are not null or empty
        // 2. Create string builder that will contain final result
        // 3. Iterate over given String s1 or String s2
        // 4. On each iteration compare the characters and add it to the builder based on rules
        // 5. Return string builder converted to String
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("")) return "";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '+' && s2.charAt(i) == '+') {
                result.append("+");
            } else if (s1.charAt(i) == '-' && s2.charAt(i) == '-') {
                result.append("-");
            } else if (s1.charAt(i) == '+' && s2.charAt(i) == '-' || s1.charAt(i) == '-' && s2.charAt(i) == '+') {
                result.append("0");
            }
        }
        return result.toString();
    }

}
