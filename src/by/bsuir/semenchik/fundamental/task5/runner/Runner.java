package by.bsuir.semenchik.fundamental.task5.runner;

import by.bsuir.semenchik.fundamental.task5.util.NotSortedNumbArray;

public class Runner {

    public static void main(String args[]) {
        int[] arr = {0, 5, 1, 4, 15, 3, 9, 8, 12, 7};
        System.out.print(NotSortedNumbArray.deletedElementsCount(arr));
    }
}