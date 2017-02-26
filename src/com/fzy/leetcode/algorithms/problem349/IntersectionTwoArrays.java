package com.fzy.leetcode.algorithms.problem349;

import java.util.*;

/**
 * Created by fuzeyi on 2017/2/26.
 */
public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<>();
        for (int num : nums1) {
            if (nums1Map.get(num) != null) {
                nums1Map.put(num, nums1Map.get(num) + 1);
            } else {
                nums1Map.put(num, 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num2 : nums2) {
            if (nums1Map.get(num2) != null && !list.contains(num2)) {
                list.add(num2);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = new IntersectionTwoArrays().intersection(nums1, nums2);
        System.out.println("intersection: " + Arrays.toString(result));
    }
}
