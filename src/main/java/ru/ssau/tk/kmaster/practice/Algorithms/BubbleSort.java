package ru.ssau.tk.kmaster.practice.Algorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{58, 29, 85, 41, 23, 35, 61, 42, 75, 24, 47, 55, 63};
        System.out.println("Source array: " + arrayToString(array) + '\n');
        bubbleSort(array);
        System.out.println("\nSort array: " + arrayToString(array));
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    isSorted = false;
                }
            }
            System.out.println(arrayToString(arr));
        }
    }

}

