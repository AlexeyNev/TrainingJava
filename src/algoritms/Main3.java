package algoritms;

public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[]{64, 32, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};  //Сортировка пузырьком
        int rsl;
        boolean isSorted = false;

        while (!isSorted) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    rsl = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = rsl;
                }
            }
        }
    }
}
