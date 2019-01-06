package by.bsuir.semenchik.test.task4;

import by.bsuir.semenchik.fundamental.task4.util.ArrWithPrimeNumb;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrWithPrimeNumbTest extends TestCase {

    public void testPrimeNumbPlaces() {
        int[] array = {15,11,7,12};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> actual = ArrWithPrimeNumb.primeNumbPlaces(array);
        assertEquals(expected, actual);
    }
}