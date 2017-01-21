package com.fzy.leetcode.algorithms.problem461;

/**
 * Created by fuzeyi on 2017/1/21.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            if ((x & 0x1) != (y & 0x1)) {
                count += 1;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println("HammingDistance: " + new HammingDistance().hammingDistance(x, y));
    }
}
