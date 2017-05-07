package com.fzy.leetcode.algorithms.problem268;

import java.util.Arrays;

/**
 * Created by fuzeyi on 2017/4/4.
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
           if(i!=nums[i]){
                return i;
           }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3};
        System.out.println("result: " + new MissingNumber().missingNumber(nums));
    }
}
