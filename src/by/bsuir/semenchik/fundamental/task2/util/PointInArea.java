package by.bsuir.semenchik.fundamental.task2.util;

public class PointInArea {

    public static boolean isInArea(double x, double y) {
        boolean result = false;
        if (y > 0 && x <= 4 && x >= -4 && y <= 5) {
            result = true;
        }
        if (y <= 0 && x <= 6 && x >= -6 && y >= -3) {
            result = true;
        }
        return result;
    }

}
