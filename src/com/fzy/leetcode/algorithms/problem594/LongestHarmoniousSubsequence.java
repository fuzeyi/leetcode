package com.fzy.leetcode.algorithms.problem594;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/6/18.
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> charNumsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (null == charNumsMap.get(nums[i])) {
                charNumsMap.put(nums[i], 1);
            } else {
                charNumsMap.put(nums[i], charNumsMap.get(nums[i]) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int key : charNumsMap.keySet()) {
            int either = key - 1;
            int other = key + 1;
            if (null != charNumsMap.get(either)) {
                int sum = charNumsMap.get(key) + charNumsMap.get(either);
                if (sum > max) {
                    max = sum;
                }
            }
            if (null != charNumsMap.get(other)) {
                int sum = charNumsMap.get(key) + charNumsMap.get(other);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
