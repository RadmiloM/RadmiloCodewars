public class Counter {
    /*
    Problem description:
    You need to make a constructor function with two methods (and only these two methods)
    to return and increment a counter, but the counter should not be directly accessible from outside the function.
     */
    private int counter = 0;
    public int check() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
