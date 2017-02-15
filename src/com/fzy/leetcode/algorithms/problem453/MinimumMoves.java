package com.fzy.leetcode.algorithms.problem453;

import java.util.Arrays;

/**
 * Created by fuzeyi on 2017/2/10.
 */
public class MinimumMoves {
    public int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        for (int n : nums) {
            min = Math.min(min, n);
        }
        int count = 0;
        for (int n : nums) {
            count += n - min;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2147483647};
        System.out.println("count: " + new MinimumMoves().minMoves(nums));
    }

}
