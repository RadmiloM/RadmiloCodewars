public class BoilingWater {
    /*
    Problem description:
    Implement a function, which takes a non-negative integer,
    representing the number of eggs to boil. It must return the time in minutes (integer), which it takes to have all the eggs boiled.
     */
    public static int cookingTime(int eggs) {
        //1. Validate input data check if eggs number is less or equal to 0
        //2. Check if eggs is greater then 0 and less or equal to 8 and return 5
        //3. create variable result and store 5 to it
        //4. on each iteration which starts from 8 and which goes up to eggs provided increment by 8 and add it to the result
        //5. Int the end return result
        if (eggs <= 0) return 0;
        if (eggs > 0 && eggs <= 8) return 5;
        int result = 5;
        for (int i = 8; i <= eggs; i += 8) {
            result += 5;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cookingTime(0));
        System.out.println(cookingTime(5));
        System.out.println(cookingTime(10));
    }
}
