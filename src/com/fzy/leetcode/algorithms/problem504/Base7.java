package com.fzy.leetcode.algorithms.problem504;

import java.util.Stack;

/**
 * Created by fuzeyi on 2017/2/18.
 */
public class Base7 {
    public String convertToBase7(int num) {
        int n = Math.abs(num);
        if (n == 0) {
            return "0";
        }
        Stack<Integer> stack = new Stack<Integer>();
        StringBuffer sb = new StringBuffer();
        while (n != 0) {
            stack.push(n % 7);
            n = n / 7;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        if (num < 0) {
            return "-" + sb.toString();
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        int num = 100;
        System.out.println("Num: " + new Base7().convertToBase7(num));
    }
}
