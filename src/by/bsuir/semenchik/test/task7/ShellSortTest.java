package by.bsuir.semenchik.test.task7;

import by.bsuir.semenchik.fundamental.task7.util.ShellSort;
import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

public class ShellSortTest extends TestCase {

    public void testSort() {
        int[] array = {4, 7, 2, 1, 45, 12, 9};
        int[] expected = {1, 2, 4, 7, 9, 12, 45};
        int[] actual = ShellSort.sort(array);
        Assert.assertTrue(Arrays.equals(actual,expected));
    }
}