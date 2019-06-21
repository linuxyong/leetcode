package org.linuxyong.leetcode.problems.p53;

/**
 * Created by yongly on 2019/6/21.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int largest = nums[0];
        int temp = 0;
        for (int i = 0; i < nums.length; ++i) {
            temp += nums[i];
            if (temp > largest) {
                largest = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }

        return largest;
    }
}
