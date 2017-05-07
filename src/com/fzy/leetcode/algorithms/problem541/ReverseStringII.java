package com.fzy.leetcode.algorithms.problem541;

/**
 * Created by fuzeyi on 2017/4/3.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println("result: " + new ReverseStringII().reverseStr(s, k));
    }
}
