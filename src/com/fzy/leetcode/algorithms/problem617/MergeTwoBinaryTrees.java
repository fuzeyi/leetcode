package com.fzy.leetcode.algorithms.problem617;

/**
 * Created by fuzeyi on 2017/6/24.
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1 && null == t2) {
            return null;
        }
        TreeNode node = null;
        if (null != t1 && null != t2) {
            node = new TreeNode(t1.val + t2.val);
            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
            return node;
        }
        if (null != t1) {
            node = new TreeNode(t1.val);
            node.left = mergeTrees(t1.left,null);
            node.right = mergeTrees(t1.right,null);
        }
        if (null != t2) {
            node = new TreeNode(t2.val);
            node.left = mergeTrees(null,t2.left);
            node.right = mergeTrees(null,t2.right);
        }
        return node;

    }

    public static void main(String[] args) {

    }
}
