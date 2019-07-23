package org.linuxyong.leetcode.problems.p94;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by yongly on 2019/7/23.
 */
public class BinaryTreeInoderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List res = new ArrayList();
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));

        return res;
    }

    public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }

}
