package org.linuxyong.utils.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/19.
 */
public class QuickSortTest {
    @Test
    public void test() {
        QuickSort sort = new QuickSort();

        long[] sorted = sort.sort(new long[]{3, 7, 6, 2, 5, 1});
        assertTrue(SortUnitTestUtils.isArraySorted(sorted));

        sorted = sort.sort(new long[]{3, 7, 6, 2, 5, 1, 1});
        assertTrue(SortUnitTestUtils.isArraySorted(sorted));

        sorted = sort.sort(new long[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10});
        assertTrue(SortUnitTestUtils.isArraySorted(sorted));
    }

}