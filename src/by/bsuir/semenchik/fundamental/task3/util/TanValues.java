package by.bsuir.semenchik.fundamental.task3.util;

public class TanValues {

    public static double[][] calculate(double left, double right, double step) {
        int resultLength = (int) ((right - left) / step);
        double[][] result = new double[resultLength + 1][2];
        double x = left;
        for (int i = 0; i < resultLength; i++) {
            result[i][0] = x;
            result[i][1] = Math.tan(x);
            x += step;
        }
        result[resultLength][0] = right;
        result[resultLength][1] = Math.tan(right);
        return result;
    }

}
