package ArrayMin;

/**
 * Простая задачка на поиск минимального значения в массиве и его порядкового номера
 */
public class ArrayM {
    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value " + minValue);
        System.out.println("min index " + minIndex);
    }
}
