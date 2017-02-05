package com.fzy.leetcode.algorithms.problem448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/2/4.
 */
public class FindAllNumbersDisappear {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            list.add(i);
        }
        for (int j = 0; j < length; j++) {
            if (list.contains(nums[j])) {
                list.remove(new Integer(nums[j]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("list: " + new FindAllNumbersDisappear().findDisappearedNumbers(nums));
    }
}
