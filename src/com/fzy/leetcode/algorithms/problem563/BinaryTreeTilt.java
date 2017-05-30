package com.fzy.leetcode.algorithms.problem563;

import com.fzy.leetcode.algorithms.problem521.TreeNode;

/**
 * Created by fuzeyi on 2017/5/14.
 */
public class BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = getSum(root.left);
        int rightResult = getSum(root.right);
        return Math.abs(leftResult - rightResult)+findTilt(root.left)+findTilt(root.right);
    }

    public int getSum(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        return root.val + getSum(root.left) + getSum(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;

        System.out.println("result: " + new BinaryTreeTilt().findTilt(root));

    }
}
