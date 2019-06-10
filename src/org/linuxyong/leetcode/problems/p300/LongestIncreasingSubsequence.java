package org.linuxyong.leetcode.problems.p300;

/**
 * Created by yongly on 2019/6/6.
 */
public class LongestIncreasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int[] cMax = new int[length];

        cMax[0] = 1;
        for (int i = 1; i < length; ++i) {
            cMax[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j] && cMax[i] < cMax[j] + 1) {
                    cMax[i] = cMax[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < length; ++i) {
            if (max < cMax[i]) {
                max = cMax[i];
            }
        }

        return max;
    }
}
