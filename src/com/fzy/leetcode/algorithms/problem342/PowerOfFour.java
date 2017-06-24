package com.fzy.leetcode.algorithms.problem342;

/**
 * Created by fuzeyi on 2017/6/21.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }

    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(new PowerOfFour().isPowerOfFour(i)){
                System.out.print(i+" ");
            }
        }
    }
}
