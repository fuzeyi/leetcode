package com.fzy.leetcode.algorithms.problem476;

import com.fzy.leetcode.algorithms.problem461.HammingDistance;

/**
 * Created by fuzeyi on 2017/1/21.
 */
public class NumberComplement {
    public int findComplement(int num) {
        int result = 0;
        int count = 0;
        int temp;
        while (num != 0) {
            temp = 0x1 ^ (num & 0x1);
            result += Math.pow(2, count) * temp;
            count += 1;
            num = num >> 1;
        }

        return result;

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("NumberComplement: " + new NumberComplement().findComplement(num));
    }
}
