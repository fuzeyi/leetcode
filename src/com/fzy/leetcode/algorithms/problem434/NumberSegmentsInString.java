package com.fzy.leetcode.algorithms.problem434;

/**
 * Created by fuzeyi on 2017/6/24.
 */
public class NumberSegmentsInString {
    public int countSegments(String s) {
        if("".equalsIgnoreCase(s)){
            return 0;
        }
        String[] strs = s.split(" ");
        int count = 0;
        for (String chs : strs) {
            if(!chs.trim().equalsIgnoreCase("")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.print("result: " + new NumberSegmentsInString().countSegments(s));
    }
}
