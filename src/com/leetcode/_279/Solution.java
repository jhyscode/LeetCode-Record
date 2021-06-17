package com.leetcode._279;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/20 16:57
 * @Description ：
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = i;  // 最坏的情况就是每次+1
            for (int j = 1; i - j * j >= 0 ; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);  // 动态转移方程
            }
        }
        return dp[n];
    }
}
