package org.linuxyong.leetcode.problems.p978;

/**
 * Created by yongly on 2019/6/21.
 */
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] A) {
        if (A.length <= 1) {
            return A.length;
        }

        int length = 1;
        int c = A[1] - A[0]; // 1 for greater than; -1 for less than; 0 for equal

        for (int i = 1; i < A.length; ++i) {
            if (A[i] > A[i-1]) {
                c
            }

        }

        return length;
    }
}
