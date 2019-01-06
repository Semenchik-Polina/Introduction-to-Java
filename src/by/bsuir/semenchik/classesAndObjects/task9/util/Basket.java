package by.bsuir.semenchik.classesAndObjects.task9.util;

import java.util.*;

public class Basket {
    private List<Ball> ballList = new ArrayList<>();

    public void addBall(Ball ball) {
        if (ball != null) {
            ballList.add(ball);
        }
    }

    public void removeBall(Ball ball) {
        if (ball != null) {
            ballList.remove(ball);
        }
    }

    public int getBallsWeight() {
        int sum = 0;
        for (Ball item : ballList)
            sum += item.getWeight();
        return sum;
    }

    public int numbOfBlueBalls() {
        int count = 0;
        for (Ball item : ballList) {
            if (item.getColor() == "blue") {
                count++;
            }
        }
        return count;
    }
}
