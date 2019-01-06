package by.bsuir.semenchik.test.task5;

import by.bsuir.semenchik.fundamental.task5.util.NotSortedNumbArray;
import junit.framework.TestCase;

public class NotSortedNumbArrayTest extends TestCase {

    public void testDeletedElementsCount() {
        int[] array = {0,1,2,3,4,5,6};
        assertEquals(0, NotSortedNumbArray.deletedElementsCount(array));
    }
}