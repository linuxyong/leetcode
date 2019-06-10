package org.linuxyong.leetcode.problems.p300;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/10.
 */
public class LongestIncreasingSubsequenceTest {
    @Test
    public void test() {
        int[] nums = {1, 8, 9, 3, 4, 5, 6, 7};
        int numberOfLIS = new LongestIncreasingSubsequence().findNumberOfLIS(nums);
        assertEquals(numberOfLIS, 6);

    }

}