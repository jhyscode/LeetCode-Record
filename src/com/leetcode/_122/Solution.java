package com.leetcode._122;

/**
 * 贪心算法
 * @author ：jhys
 * @date ：Created in 2021/3/27 11:04
 * @Description ：
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i]  - prices[i - 1];
            if (temp > 0) {
                profit = profit + temp;
            }
        }
        return profit;
    }
}
