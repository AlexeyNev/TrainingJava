package ArrayMin;

import java.util.Arrays;

public class ArraySortM {
    public static void main(String[] args) {
        int[] array = new int[]{5, 2, 6, 7, 9, 6, 1, 8, 4};
        System.out.println(Arrays.toString(array));
        new BubbleExample().bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}