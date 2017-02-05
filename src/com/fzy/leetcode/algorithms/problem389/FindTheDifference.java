package com.fzy.leetcode.algorithms.problem389;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/2/5.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char ch = ' ';
        Map<Character, Integer> nums = new HashMap<>();
        setNums(nums, s);
        setNums(nums, t);
        for (Character c : nums.keySet()) {
            if (nums.get(c) % 2 != 0) {
               ch = c;
            }
        }
        return ch;
    }

    private void setNums(Map<Character, Integer> nums, String s) {
        for (char c : s.toCharArray()) {
            if (nums.get(c) == null) {
                nums.put(c, 1);
            } else {
                nums.put(c, nums.get(c) + 1);
            }
        }
    }

}
