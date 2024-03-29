package com.leetcode._62;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/16 16:56
 * @Description ：
 */
public class Solution {

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        // 返回所有可能的结果
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 3));
    }
}
