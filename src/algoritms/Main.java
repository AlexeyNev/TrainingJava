package algoritms;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {64, 32, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println(minValue);
    }
}
