package by.bsuir.semenchik.fundamental.task1.util;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

public class MathFormula {
    public static double calculate(double x, double y) {
        double result;
        result = (1 + pow(sin(x + y), 2)) / (2 + abs(x + 2 * x / (1 + pow(x, 2) * pow(y, 2)))) + x;
        return result;
    }
}
