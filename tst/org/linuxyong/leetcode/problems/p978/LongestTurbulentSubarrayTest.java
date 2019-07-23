package org.linuxyong.leetcode.problems.p978;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/7/23.
 */
public class LongestTurbulentSubarrayTest {

    private LongestTurbulentSubarray instance = new LongestTurbulentSubarray();

    @Test
    public void maxTurbulenceSize() throws Exception {
        int[] nums = {9,4,2,10,7,8,8,1,9};
        int res = instance.maxTurbulenceSize(nums);
        assertEquals(res, 5);

        int[] nums1 = {37,199,60,296,257,248,115,31,273,176};
        res = instance.maxTurbulenceSize(nums1);
        assertEquals(res, 5);
    }

}