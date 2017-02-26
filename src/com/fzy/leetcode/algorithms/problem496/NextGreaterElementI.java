package com.fzy.leetcode.algorithms.problem496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by fuzeyi on 2017/2/15.
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);//map键对应的map值，如果不存在map键，返回默认值
        return findNums;
    }

    public static void main(String[] args) {
        int[] findNums = {4, 1,2};
        int[] nums = {1, 2, 3, 4};
        System.out.print("nums: " + Arrays.toString(new NextGreaterElementI().nextGreaterElement(findNums, nums)));
    }

}
