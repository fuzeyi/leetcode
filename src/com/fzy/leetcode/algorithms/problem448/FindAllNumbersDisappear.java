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
        for (int i = 0; i < length; i++) {
            int a = Math.abs(nums[i]) - 1;
            if (nums[a] > 0) {
                nums[a] = -nums[a];
            }
        }
        for (int j = 0; j < length; j++) {
            if (nums[j] > 0) {
                list.add(j + 1);
            }
        }


        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("list: " + new FindAllNumbersDisappear().findDisappearedNumbers(nums));
    }
}
