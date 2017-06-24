package com.fzy.leetcode.algorithms.problem367;

/**
 * Created by fuzeyi on 2017/6/23.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        boolean result = false;
        for (int i = 2; i < num / 2; i++) {
            if(i*i ==num){
                return true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.print("result:" + new ValidPerfectSquare().isPerfectSquare(num));
    }
}
