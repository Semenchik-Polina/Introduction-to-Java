package by.bsuir.semenchik.fundamental.task8.util;

import java.util.ArrayList;
import java.util.List;

public class MergedArray {

    public static List<Integer> mergeArrays(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        do {
            if (array1[i] <= array2[j]) {
                result.add(array1[i]);
                i++;
            } else {
                result.add(array2[j]);
                j++;
                res.add(result.size() - j);
            }
        } while (!(i == array1.length || j == array2.length));

        if (i == array1.length) {
            int index = j;
            addLastElements(result, array2, j);
            for (int k = 0; k <= index; k++)
                res.add(array1.length);
        }
        if (j == array2.length) {
            addLastElements(result, array1, i);
        }
        return res;
    }

    private static List<Integer> addLastElements(List<Integer> list, int[] array, int index) {
        while (index < array.length) {
            list.add(array[index]);
            index++;
        }
        return list;
    }

}
