package by.bsuir.semenchik.fundamental.task7.runner;

import by.bsuir.semenchik.fundamental.task7.util.ShellSort;

public class Runner {

    public static void main(String args[]) {
        int[] array = {11, 36, 3, 55, 4, 8, 1, 20};
        StringBuilder builder = new StringBuilder();
        for (int item : ShellSort.sort(array)) {
            builder.append(item).append(" ");
        }
        System.out.print(builder.toString());
    }

}
