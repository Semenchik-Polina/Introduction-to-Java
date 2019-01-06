package by.bsuir.semenchik.classesAndObjects.task9.runner;

import by.bsuir.semenchik.classesAndObjects.task9.util.Ball;
import by.bsuir.semenchik.classesAndObjects.task9.util.Basket;

public class Runner {

    public static void main(String[] args) {
        Ball ball1 = new Ball("blue", 3);
        Ball ball2 = new Ball("blue", 2);
        Ball ball3 = new Ball("yellow", 1);
        Ball ball4 = new Ball("red", 5);
        Ball ball5 = new Ball("blue", 4);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(null);
        basket.addBall(ball4);
        basket.addBall(ball5);

        Basket basketNull = new Basket();

        System.out.println("Weight = " + basketNull.getBallsWeight());
        System.out.println("Weight = " + basket.getBallsWeight());
        System.out.println("Numb of blue = " + basket.numbOfBlueBalls());
    }
}