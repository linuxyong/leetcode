package org.linuxyong.leetcode.problems.p32;

/**
 * Created by yongly on 2019/6/11.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {

        int stack = 0;
        int length = 0;
        int[] cLen = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                stack++;
            } else if (c == ')') {
                if (stack > 0) {
                    length += 2;
                    if (--stack == 0) {
                        if (i > length) {
                            cLen[i] = length + cLen[i - length];
                        } else {
                            cLen[i] = length;
                        }
                        length = 0;
                    }
                }
            }
        }

        int maxLength = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (maxLength < cLen[i]) {
                maxLength = cLen[i];
            }
        }

        return maxLength;
    }
}
