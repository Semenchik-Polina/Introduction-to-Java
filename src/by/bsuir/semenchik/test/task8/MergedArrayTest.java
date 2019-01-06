package by.bsuir.semenchik.test.task8;

import by.bsuir.semenchik.fundamental.task8.util.MergedArray;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergedArrayTest extends TestCase {

    public void testMergeArrays() {
        int[] array1 = {3,5};
        int[] array2 = {0,1,2,4,7,10};
        Integer[] expectedArr =  {0,1,2,3,4,5,7,10};
        List<Integer> expected = Arrays.asList(expectedArr);
        List<Integer> actual = MergedArray.mergeArrays(array1, array2);
        Assert.assertEquals(actual, expected);
    }
}