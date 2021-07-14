package com.leetcode._221;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/19 23:35
 * @Description ：
 */

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        if (n == 0) {
            return 0;
        }
        int m = matrix[0].length;
        if (m == 0) {
            return 0;
        }
        int[][] dp = new int[n][m];
        int result = 0;
        for (int i = 0; i < n; i++) {
            dp[i][0] = matrix[i][0] - '0';
            result = Math.max(dp[i][0],result);
        }
        for(int j = 0 ;j < m;j++){
            dp[0][j] = matrix[0][j] - '0';
            result = Math.max(dp[0][j],result);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
        return result * result;

    }
}
