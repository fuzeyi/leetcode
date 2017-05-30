package com.fzy.leetcode.algorithms.problem405;

/**
 * Created by fuzeyi on 2017/5/25.
 */
public class ConvertNumberHexadecimal {
    public String toHex(int num) {

        String sb = new String();
        int temp = num;
        while (temp != 0) {
            sb =getHexChar(temp%16) +sb;
            temp /= 16;
        }

        return  "0x"+sb;
    }

    public String getHexChar(int num) {
        if (num < 10) {
            return String.valueOf(num);
        } else if (num == 10) {
            return "a";
        } else if (num == 11) {
            return "b";
        } else if (num == 12) {
            return "c";
        } else if (num == 13) {
            return "d";
        } else if (num == 14) {
            return "e";
        } else if (num == 15) {
            return "f";
        }
        return null;
    }

    public static void main(String[] args) {
        int num = 18;
        System.out.print("result: " + new ConvertNumberHexadecimal().toHex(num));
    }
}
