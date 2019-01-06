package by.bsuir.semenchik.fundamental.task5.util;

public class NotSortedNumbArray {

    public static int deletedElementsCount(int[] arr) {
        return arr.length - longestIncreasingSubsequenceLength(arr);
    }

    // Binary search
    private static int ceilIndex(int array[], int left, int right, int key) {
        while (right - left > 1) {
            int middle = left + (right - left) / 2;
            if (array[middle] >= key) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return right;
    }

    private static int longestIncreasingSubsequenceLength(int arr[]) {
        int[] tailTable = new int[arr.length];
        int length; // always points empty slot

        tailTable[0] = arr[0];
        length = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < tailTable[0]) {
                tailTable[0] = arr[i];
            } else if (arr[i] > tailTable[length - 1]) {
                tailTable[length++] = arr[i];
            } else {
                tailTable[ceilIndex(tailTable, -1, length - 1, arr[i])] = arr[i];
            }
        }
        return length;
    }
}
