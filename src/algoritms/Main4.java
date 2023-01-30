package algoritms;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] array = new int[] {3, 6, 2, 77, 34, 22};
        int rsl;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    rsl = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = rsl;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
