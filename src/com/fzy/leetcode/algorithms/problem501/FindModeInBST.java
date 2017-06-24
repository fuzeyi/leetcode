package com.fzy.leetcode.algorithms.problem501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/6/23.
 */
public class FindModeInBST {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> nums = new HashMap<>();
        countNums(root, nums);
        int max = Integer.MIN_VALUE;
        for (int count : nums.values()) {
            if (count > max) {
                max = count;
            }
        }
        List<Integer> temp = new ArrayList<>();
        for (int key : nums.keySet()) {
            if (max == nums.get(key)) {
                temp.add(key);
            }
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp.get(i);
        }
        return result;
    }

    private void countNums(TreeNode root, Map<Integer, Integer> nums) {
        if (null == root) {
            return;
        }
        if (nums.get(root.val) == null) {
            nums.put(root.val, 1);
        } else {
            nums.put(root.val, nums.get(root.val) + 1);
        }
        countNums(root.left, nums);
        countNums(root.right, nums);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
