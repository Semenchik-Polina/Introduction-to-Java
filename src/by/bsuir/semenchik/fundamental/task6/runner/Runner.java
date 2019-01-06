package by.bsuir.semenchik.fundamental.task6.runner;

import by.bsuir.semenchik.fundamental.task6.util.QuadraticMatrix;

public class Runner {

    public static void main(String args[]) {
        int[] array = {1, 6, 5};
        for (int[] line : QuadraticMatrix.getMatrix(array)) {
            for (int item : line){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
