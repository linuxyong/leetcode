package org.linuxyong.leetcode.problems.p673;

/**
 * Created by yongly on 2019/6/10.
 */
public class NumOfLongestIncrasingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }

        int[] cMax = new int[length];
        int[] maxNum = new int[length];

        cMax[0] = 1;
        maxNum[0] = 1;
        for (int i = 1; i < length; ++i) {
            cMax[i] = 1;
            maxNum[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j] ) {
                    if (cMax[i] < cMax[j] + 1) {
                        cMax[i] = cMax[j] + 1;
                        maxNum[i] = maxNum[j];
                    } else if (cMax[i] == cMax[j] + 1) {
                        maxNum[i] += maxNum[j];
                    }
                }
            }
        }

        int max = 0;
        int num = 0;
        for (int i = 0; i < length; ++i) {
            if (max < cMax[i]) {
                max = cMax[i];
                num = maxNum[i];
            } else if (max == cMax[i]) {
                num += maxNum[i];
            }
        }

        return num;
    }
}
