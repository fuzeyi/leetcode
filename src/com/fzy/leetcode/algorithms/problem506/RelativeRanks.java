package com.fzy.leetcode.algorithms.problem506;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/2/7.
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        String[] ranks = new String[length];
        int[] backs = Arrays.copyOf(nums, length);
        System.out.println("backs: " + Arrays.toString(backs));
        Map<Integer, String> aa = new HashMap<>();
        Arrays.sort(nums);
        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) {
                aa.put(nums[i], "Gold Medal");
            } else if (i == length - 2) {
                aa.put(nums[i], "Silver Medal");
            } else if (i == length - 3) {
                aa.put(nums[i], "Bronze Medal");
            } else {
                aa.put(nums[i], (length - i ) + "");
            }
        }
        for (int j = 0; j < length; j++) {
            ranks[j] = aa.get(backs[j]);
        }
        //System.out.println("nums: " + Arrays.toString(nums));
        //System.out.println("ranks: " + Arrays.toString(ranks));
        return ranks;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        System.out.println("args = [" + new RelativeRanks().findRelativeRanks(nums) + "]");
    }
}
