package com.fzy.leetcode.algorithms.problem122;

/**
 * Created by fuzeyi on 2017/2/26.
 */
public class BestTimeBuySellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        while (i < prices.length) {
            // find next local minimum
            while (i < prices.length-1 && prices[i+1] <= prices[i]) i++;
            int min = prices[i++]; // need increment to avoid infinite loop for "[1]"
            // find next local maximum
            while (i < prices.length-1 && prices[i+1] >= prices[i]) i++;
            profit += i < prices.length ? prices[i++] - min : 0;
        }
        return profit;
    }
}
