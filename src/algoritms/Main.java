package algoritms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {64, 32, 73, 41, 31};

        for (int step = 0; step < array.length; step++) {
            System.out.println(Arrays.toString(array));
            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];

        for (int i = start; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
