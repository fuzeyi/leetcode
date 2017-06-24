package com.fzy.leetcode.algorithms.problem035;

/**
 * Created by fuzeyi on 2017/6/14.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            } else if (target > nums[i]) {
                if (i + 1 > nums.length - 1) {
                    return i+1;
                }
                if(target <nums[i+1]){
                    return i+1;
                }
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int target = 5;
        int[] nums = {1, 3, 5, 6};
        System.out.println("result: " + new SearchInsertPosition().searchInsert(nums, target));
    }
}
