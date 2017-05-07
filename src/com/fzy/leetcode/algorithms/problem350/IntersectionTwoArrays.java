package com.fzy.leetcode.algorithms.problem350;

import java.util.*;

/**
 * Created by fuzeyi on 2017/4/3.
 */
public class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> num1Map = getNumsMap(nums1);
        Map<Integer, Integer> num2Map = getNumsMap(nums2);
        for (Integer num : num1Map.keySet()) {
            if (null == num1Map.get(num) || null == num2Map.get(num)) {
                continue;
            } else {
                int count = num1Map.get(num) <= num2Map.get(num) ? num1Map.get(num) : num2Map.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
            }
        }
        int[] nums = new int[result.size()];
        for (int j = 0; j < result.size(); j++) {
            nums[j] = result.get(j);
        }
        return nums;
    }

    Map<Integer, Integer> getNumsMap(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int num1 : nums) {
            if (null != numsMap.get(num1)) {
                numsMap.put(num1, numsMap.get(num1) + 1);
            } else {
                numsMap.put(num1, 1);
            }
        }
        return numsMap;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(new IntersectionTwoArrays().intersect(nums1, nums2)));
    }
}
