package by.bsuir.semenchik.fundamental.task7.util;

public class ShellSort {

    public static int[] sort(int[] array) {
        int result[] = array;
        int lenght = result.length;
        int temp, j;
        for (int step = lenght / 2; step > 0; step /= 2) {
            for (int i = step; i < lenght; i++) {
                temp = result[i];
                for (j = i; j >= step && result[j - step] > temp; j -= step) {
                    result[j] = result[j - step];
                }
                result[j] = temp;
            }
        }
        return result;
    }
}

