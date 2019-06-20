package org.linuxyong.utils.sort;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/19.
 */
public class SortUnitTestUtils {
    static public boolean isArraySorted(long[] array) {
        for (int i = 1; i < array.length; ++i ) {
            if (array[i-1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        assertTrue(isArraySorted(new long[]{}));
        assertTrue(isArraySorted(new long[]{1}));
        assertTrue(isArraySorted(new long[]{1,1,1,1,1}));
        assertTrue(isArraySorted(new long[]{1,2,3,4,5}));
        assertTrue(isArraySorted(new long[]{1,1,3,4,5}));
        assertFalse(isArraySorted(new long[]{1,2,1,4,5}));
    }
}
