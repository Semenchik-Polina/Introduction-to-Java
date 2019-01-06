package by.bsuir.semenchik.test.task6;

import by.bsuir.semenchik.fundamental.task6.util.QuadraticMatrix;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

public class QuadraticMatrixTest extends TestCase {

    public void testGetMatrix() {
        int[] array = {1, 6, 5};
        int[][] expected = {{1, 6, 5}, {6, 5, 1}, {5, 1, 6}};
        int[][] actual = QuadraticMatrix.getMatrix(array);
        Assert.assertTrue(Arrays.equals(actual, expected));
    }
}