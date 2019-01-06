package by.bsuir.semenchik.test.task2;

import by.bsuir.semenchik.fundamental.task2.util.PointInArea;
import junit.framework.TestCase;

public class PointInAreaTest extends TestCase {

    public void testIsInArea(){
        boolean actual = PointInArea.isInArea(2,4);
        assertEquals(true, actual);

        actual = PointInArea.isInArea(-10,-10);
        assertEquals(false, actual);
    }

}