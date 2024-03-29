package com.leetcode._309;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/20 18:11
 * @Description ：
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) {
            return 0;
        }
        //dp[i][k], 表示第i天结束时的持有状态。明确dp，转移方程就容易了
        //由于可以无限次交易，所以只定义两个维度，第一个维度是天数，第二个维度表示是否持有股票，0表示不持有，1表示持有，2表示过渡期
        int[][] dp = new int[n][3];
        dp[0][0] = 0;
        dp[0][1] = -1 * prices[0];
        dp[0][2] = 0;

        for (int i = 1; i < n; i++) {
            //第i天不持有股票的情况有两种
            //a.第i-1天也不持有股票
            //b.第i-1天是过渡期
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            //第i天持有股票有两种情况
            //a.第i-1天也持有股票，第i天不操作，
            //b.第i-1天不持有股票，在第i天买入
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            //第i天是冷冻期只有一种情况，第i-1天持有股票且卖出
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        //最后最大利润为最后一天，不持有股票或者进入冷冻期的情况
        return Math.max(dp[n-1][0],dp[n-1][2]);
    }
}
