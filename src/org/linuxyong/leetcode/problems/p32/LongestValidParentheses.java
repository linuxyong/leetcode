package org.linuxyong.leetcode.problems.p32;

import java.util.Stack;

/**
 * Created by yongly on 2019/6/11.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        int maxLength = 0;
        int[] cLen = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    Integer pair = stack.pop();
                    int length = i - pair + 1;
                    if (length == i + 1) {
                        cLen[i] = length;
                    } else {
                        cLen[i] = length + cLen[pair-1];
                    }
                }
            }
        }

        for (int i = 0; i < s.length(); ++i) {
            if (maxLength < cLen[i]) {
                maxLength = cLen[i];
            }
        }

        return maxLength;
    }
}
