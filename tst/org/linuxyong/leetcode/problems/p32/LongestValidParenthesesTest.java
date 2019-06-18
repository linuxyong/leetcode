package org.linuxyong.leetcode.problems.p32;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yongly on 2019/6/11.
 */
public class LongestValidParenthesesTest {
    @Test
    public void test() {
        LongestValidParentheses instance = new LongestValidParentheses();

        int res = 0;
        res = instance.longestValidParentheses("()");
        assertEquals(res, 2);

        res = instance.longestValidParentheses("(())");
        assertEquals(res, 4);

        res = instance.longestValidParentheses("()()");
        assertEquals(res, 4);

        res = instance.longestValidParentheses("()(()");
        assertEquals(res, 2);

        res = instance.longestValidParentheses(")()(()");
        assertEquals(res, 2);

        res = instance.longestValidParentheses(")()(())");
        assertEquals(res, 6);

        res = instance.longestValidParentheses("(()");
        assertEquals(res, 2);

        res = instance.longestValidParentheses("(()(()");
        assertEquals(res, 2);

        res = instance.longestValidParentheses("(()(()()");
        assertEquals(res, 4);

        res = instance.longestValidParentheses("(()())");
        assertEquals(res, 6);
    }

}