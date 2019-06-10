package org.linuxyong.leetcode.problems.p673;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/10.
 */
public class NumOfLongestIncrasingSubsequenceTest {
    @Test
    public void test() {
        int[] nums = {1,3,5,4,7};
        int numberOfLIS = new NumOfLongestIncrasingSubsequence().findNumberOfLIS(nums);
        assertEquals(numberOfLIS, 2);

        int[] nums1 = {2,2,2,2,2};
        numberOfLIS = new NumOfLongestIncrasingSubsequence().findNumberOfLIS(nums1);
        assertEquals(numberOfLIS, 5);

        int[] nums2 = {1,2,4,3,5,4,7,2};
        numberOfLIS = new NumOfLongestIncrasingSubsequence().findNumberOfLIS(nums2);
        assertEquals(numberOfLIS, 3);

    }

}