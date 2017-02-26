package com.fzy.leetcode.algorithms.problem520;

/**
 * Created by fuzeyi on 2017/2/21.
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char[] chs = word.toCharArray();
        int upperCount = 0;
        int lowerCount = 0;
        for (char ch : chs) {
            if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;
            }
        }
        if (upperCount == chs.length || lowerCount == chs.length) {
            return true;
        } else if (chs[0] >= 'A' && chs[0] <= 'Z' && lowerCount == chs.length) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        String word = "USA";
        System.out.print("flag: " + new DetectCapital().detectCapitalUse(word));
    }
}
