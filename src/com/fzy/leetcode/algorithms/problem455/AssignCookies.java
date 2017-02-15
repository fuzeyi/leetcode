package com.fzy.leetcode.algorithms.problem455;

import java.util.Arrays;

/**
 * Created by fuzeyi on 2017/2/9.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            for (; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    count++;
                    j = j + 1;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        System.out.println("count: " + new AssignCookies().findContentChildren(g, s));
    }
}
