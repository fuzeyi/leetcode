package com.fzy.leetcode.algorithms.problem409;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fuzeyi on 2017/3/25.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        int count = 0;
        int odd = 0;
        for (Character ch : map.keySet()) {
            if (map.get(ch) % 2 == 0) {
                count += map.get(ch);
            } else {
                count += map.get(ch) - 1;
                odd++;
            }
        }
        if (odd > 0) {
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println("length: " + new LongestPalindrome().longestPalindrome(s));
    }
}
