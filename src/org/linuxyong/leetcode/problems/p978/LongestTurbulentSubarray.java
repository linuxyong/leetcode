package org.linuxyong.leetcode.problems.p978;

/**
 * Created by yongly on 2019/6/21.
 */
public class LongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] A) {
        if (A.length <= 1) {
            return A.length;
        }

        int maxLength = 1;
        int length = 1;
        int c = 1; // 1 for greater than; -1 for less than; 0 for equal

        for (int i = 0; i < A.length - 1; ++i) {
            int temp = check(A[i], A[i+1]);
            if (c * temp < 0) {
                ++length;
            } else if (temp == 0) {
                maxLength = length > maxLength ? length : maxLength;
                length = 1;
            } else {
                maxLength = length > maxLength ? length : maxLength;
                length = 2;
            }
            c = temp;
        }

        maxLength = length > maxLength ? length : maxLength;

        return maxLength;
    }

    private int check(int a, int b) {
        if (a == b) {
            return 0;
        }
        return a < b ? -1 : 1;
    }
}
