package com.fzy.leetcode.algorithms.problem492;

/**
 * Created by fuzeyi on 2017/2/6.
 */
public class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        int sqrtNum;
        for (sqrtNum = 1; sqrtNum <= area / 2; sqrtNum++) {
            if (sqrtNum * sqrtNum <= area && (sqrtNum + 1) * (sqrtNum + 1) > area) {
                break;
            }
        }
        int length;
        int width = 1;
        for (length = sqrtNum; length < area; length++) {
            if (area % length == 0) {
                width = area / length;
                break;
            }
        }
        int[] a = new int[2];
        a[0] = length > width ? length : width;
        a[1] = width < length ? width : length;
        return a;
    }

    public static void main(String[] args) {
        int area = 2;
        int[] a = new ConstructTheRectangle().constructRectangle(area);
        System.out.println("NumberComplement: [" + a[0] + "," + a[1] + "]");
    }

}
