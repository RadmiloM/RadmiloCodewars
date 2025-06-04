import java.util.Arrays;

/*
Problem description:
The constructor should take an array as an argument,
this will contain 3 integers of the form [width, length, height] from which the Block should be created.
 */
public class Block {
    private int[] array;

    public Block(int[] array) {
        this.array = array;
    }

    public int getWidth() {
        if (array == null || array.length == 0) return -1;
        if (array.length == 3) {
            return array[0];
        }
        return -1;
    }



    public int getLength() {
        if (array == null || array.length == 0) return -1;
        if (array.length == 3) {
            return array[1];
        }
        return -1;
    }

    public int getHeight() {
        if (array == null || array.length == 0) return -1;
        if (array.length == 3) {
            return array[2];
        }
        return -1;
    }

    public int getVolume() {
        if (array == null || array.length == 0) return -1;
        if (array.length == 3) {
            return array[0] * array[1] * array[2];
        }
        return -1;
    }

    public int getSurfaceArea() {
        if (array == null || array.length == 0) return -1;
        if (array.length == 3) {
            return 2 * (array[1] * array[2]) + 2 * (array[1] * array[0]) + 2 * (array[0] * array[2]);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Block{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,6};
        Block block = new Block(array);
        System.out.println(block);
        System.out.println(block.getWidth());
        System.out.println(block.getLength());
        System.out.println(block.getHeight());
        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());
    }
}
