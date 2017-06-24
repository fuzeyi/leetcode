package com.fzy.leetcode.algorithms.problem459;

/**
 * Created by fuzeyi on 2017/6/19.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        boolean result = false;
        char[] chs = s.toCharArray();
        for (int count = 1; count <= chs.length / 2; count++) {
            if (isValidate(count, chs)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean isValidate(int count, char[] chs) {
        int length = chs.length;
        if (length % count != 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if(i+count<length && chs[i]!=chs[i+count]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println("result: " + new RepeatedSubstringPattern().repeatedSubstringPattern(s));
    }
}
