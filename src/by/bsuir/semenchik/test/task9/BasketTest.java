package by.bsuir.semenchik.test.task9;

import by.bsuir.semenchik.classesAndObjects.task9.util.Ball;
import by.bsuir.semenchik.classesAndObjects.task9.util.Basket;
import junit.framework.TestCase;

public class BasketTest extends TestCase {

    public void testGetBallsWeight() {
        Basket basket = new Basket();
        Ball ball1 = new Ball("blue", 4);
        Ball ball2 = new Ball("yellow", 6);
        basket.addBall(ball1);
        basket.addBall(ball2);
        int actual = basket.getBallsWeight();
        int expected = 10;
        assertEquals(expected,actual);
    }

    public void testNumbOfBlueBalls() {
        Basket basket = new Basket();
        Ball ball1 = new Ball("blue", 4);
        Ball ball2 = new Ball("yellow", 6);
        basket.addBall(ball1);
        basket.addBall(ball2);
        int actual = basket.numbOfBlueBalls();
        int expected = 1;
        assertEquals(expected,actual);
    }
}