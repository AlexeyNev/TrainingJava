package ArrayMin;

/**
 * Сложность О(n 2) О от n квадрат, то есть сложность алгоритма пропорциональна квадрату количества элементов.
 * От сюда следует, что это медленная сортировка, но довольно простая в реализации.
 */
public class BubbleExample {

    public void bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < array.length; i++) {
                int previous = array[i - 1];
                int current = array[i];
                if (previous > current) {
                    swap(array, i - 1, i);
                    sorted = false;
                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }
}

