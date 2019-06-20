package org.linuxyong.utils.search;

import org.junit.Test;
import org.linuxyong.utils.search.BinarySearch;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/19.
 */
public class BinarySearchTest {

    @Test
    public void test() {
        BinarySearch binarySearch = new BinarySearch();
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5}, 3));

        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 1));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 2));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 3));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 5));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 6));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 4));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 0));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 5, 6}, 7));


        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 1));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 2));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 3));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 4));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 5));
        assertTrue(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 6));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 0));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 4, 5, 6}, 7));
        assertFalse(binarySearch.isExist(new long[]{1, 2, 3, 5, 6, 7}, 4));
    }

}