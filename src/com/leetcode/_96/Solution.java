package com.leetcode._96;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/8 11:01
 * @Description ：
 */
public class Solution {
    public int numTrees(int n) {
        // dp[i] 代表以第 i 个为根节点组成的 BST
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
}
