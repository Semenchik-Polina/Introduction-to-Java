package by.bsuir.semenchik.fundamental.task6.util;

public class QuadraticMatrix {

    public static int[][] getMatrix(int[] array) {
        int[][] result = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[(i + j) % array.length];
            }
        }
        return result;
    }

}
