package by.bsuir.semenchik.fundamental.task8.runner;

import by.bsuir.semenchik.fundamental.task8.util.MergedArray;

public class Runner {
    public static void main(String args[]) {
        int[] array1 = {2, 8, 9, 13};
        int[] array2 = {0, 1, 3, 8, 11, 15, 16, 17};
        StringBuilder builder = new StringBuilder();
        for (Integer item : MergedArray.mergeArrays(array1, array2)) {
            builder.append(item).append(" ");
        }
        System.out.print(builder.toString());
    }
}

