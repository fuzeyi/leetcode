package com.fzy.leetcode.algorithms.problem412;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuzeyi on 2017/1/23.
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ss = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
           ss.add(getString(i));
        }
        return ss;
    }

    private String getString(int i) {
        if ((i % 3) == 0 && (i % 5) == 0) {
            return "FizzBuzz";
        }
        if ((i % 3) == 0) {
            return "Fizz";
        }
        if ((i % 5) == 0) {
            return "Buzz";
        }

        return "" + i;
    }
}
