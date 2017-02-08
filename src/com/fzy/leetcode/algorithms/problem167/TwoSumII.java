package com.fzy.leetcode.algorithms.problem167;

import java.util.Arrays;

/**
 * Created by fuzeyi on 2017/2/8.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = target - numbers[i];
            int low = i + 1;
            int high = numbers.length - 1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (numbers[middle] == num) {
                    index1 = i + 1;
                    index2 = middle+1;
                    break;
                } else if (numbers[middle] < num) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
        }
        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println("nums: " + Arrays.toString(new TwoSumII().twoSum(numbers, target)));
    }
}
