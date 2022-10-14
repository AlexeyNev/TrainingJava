package ArrayMin;

public class ArrayM1 {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 4, 33, 366, 1, 211, 72, 42, 74, 55, 36, 0};
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
