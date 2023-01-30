package algoritms;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 54, 16, 24};

        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);

            printSortStep(arr, from, to, divideIndex);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
                while (arr[rightIndex] > pivot) {
                    rightIndex--;
                }
                if (leftIndex <= rightIndex) {
                    swap(arr, rightIndex, leftIndex);
                    leftIndex++;
                    rightIndex--;
                }
        }
        return leftIndex;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(Arrays.toString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + Arrays.toString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + Arrays.toString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }
}

