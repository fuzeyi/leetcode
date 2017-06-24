package com.fzy.leetcode.algorithms.problem405;

/**
 * Created by fuzeyi on 2017/5/25.
 */
public class ConvertNumberHexadecimal {
    char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

    public String toHex(int num) {
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result;
            num = (num >>> 4);
        }
        return result;
    }


    public static void main(String[] args) {
        int num = 18;
        System.out.print("result: " + new ConvertNumberHexadecimal().toHex(num));
    }
}
