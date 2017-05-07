package com.fzy.leetcode.algorithms.problem543;

/**
 * Created by fuzeyi on 2017/4/9.
 */
public class DiameterOfBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int rigth = maxDepth(root.right);
        max = Math.max(max, left + rigth);
        return Math.max(left, rigth) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node2;
        root.right = node3;
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node2.left = node4;
        node2.right = node5;


        System.out.println("result: " + new DiameterOfBinaryTree().diameterOfBinaryTree(root));
    }
}
