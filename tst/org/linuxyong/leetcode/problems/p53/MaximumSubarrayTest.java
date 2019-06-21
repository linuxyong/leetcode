package org.linuxyong.leetcode.problems.p53;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/21.
 */
public class MaximumSubarrayTest {

    @Test
    public void test() {
        MaximumSubarray instance = new MaximumSubarray();

        int res;
        res = instance.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertEquals(res, 6);
    }

}