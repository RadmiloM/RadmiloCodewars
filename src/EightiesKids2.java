import java.util.Arrays;

public class EightiesKids2 {
    /*
    Problem description:
    Late last night in the Tanner household,
    ALF was repairing his spaceship so he might get back to Melmac.
    Unfortunately for him, he forgot to put on the parking brake, and the spaceship took off during repair. Now it's hovering in space.
    ALF has the technology to bring the spaceship home if he can lock on to its location.
     */

    public static String findSpaceship(String map) {
        //1. Validate input data check if string is not null or empty
        //2. Split string on new line
        //3. Create variable and assign empty string to that variable
        //4. Create variable that will store position of the X and assign 0 to it
        //5. Iterate over words array and check if the current character is X if that is the case assign X to that String
        //6. Create String word which will hold current word on each iteration
        //7. Iterate over current word and check if that word is X if that is the case change position variable to new position of the X
        //8. Check if the String variable is empty if that is the case return Spaceship lost forever.
        //9. Create variable that will store how many lines are before x
        //10. Iterate from right to left and check if current word contain the x if that is not the case increment the counter for row count
        //11. In the end return position of the X and number of the lines which are in front of the X
        if (map == null || map.length() == 0) return "";

        String findX = "";
        int position = 0;
        String[] words = map.split("\n");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == 'X') {
                    position = j;
                    findX = "X";
                    break;
                }
            }
        }
        if (findX.equals("")) return "Spaceship lost forever.";
        int countRows = 0;
        for(int i = words.length - 1; i >= 0; i--){
            String word = words[i];
            if(word.contains("X")) {
                break;
            }
            countRows++;
        }

        return "[" + String.valueOf(position) + ", " + String.valueOf(countRows)+"]";
    }

    public static void main(String[] args) {
        System.out.println(findSpaceship("..\nX."));
        System.out.println(findSpaceship("..\n.X"));
        System.out.println(findSpaceship("X.\n.."));
        System.out.println(findSpaceship(".X\n.."));
        System.out.println(findSpaceship("...\n.."));
        /*
         ..
         X.
         ..
         .X
         X.
         ..
         .X
         ..
         */
    }
}
