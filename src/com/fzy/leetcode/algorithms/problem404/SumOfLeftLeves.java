package com.fzy.leetcode.algorithms.problem404;

/**
 * Created by fuzeyi on 2017/2/15.
 */
public class SumOfLeftLeves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (null == root) {
            return 0;
        }
        TreeNode left = root.left;
        if (left != null) {
            if (left.left == null && left.right == null) {
                return left.val +sumOfLeftLeaves(root.right);
            } else {
                return sumOfLeftLeaves(left.left) + sumOfLeftLeaves(left.right);
            }

        } else {
            return sumOfLeftLeaves(root.right);
        }

    }

    public static void main(String[] args) {

    }
}
