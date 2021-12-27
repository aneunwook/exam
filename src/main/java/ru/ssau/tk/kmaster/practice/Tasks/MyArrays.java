package ru.ssau.tk.kmaster.practice.Tasks;

public class MyArrays {

    public static int[] size(int length) {
        return new int[length];
    }

    public static int[] generator(int length) {
        int[] array = new int[length];
        array[0] = 2;
        array[length - 1] = 2;
        for (int i = 1; i < length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }

    public static int[] oddArray(int length) {
        int[] array = new int[length];
        for (int element = 0; element < length; element++) {
            array[element] = 2 * element + 1;
        }
        return array;
    }

    public static int[] evenArray(int length) {
        int[] array = new int[length];
        for (int element = length - 1; element >= 0; element--) {
            array[element] = 2 * element + 2;
        }
        return array;
    }
}