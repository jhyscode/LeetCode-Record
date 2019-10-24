package com.leetcode._10;

/**
 * @author jhys
 * @date 2019/10/17
 */
public class Solution {
    public boolean isMatch(String s, String p) {
        int strLength = s.length();
        int patLength = p.length();
        boolean[][] dp = new boolean[strLength+1][patLength+1];
        dp[0][0] = true;
        for (int i = 1; i <= strLength; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i <= patLength; i++) {
            dp[0][i] = false;
            if (p.charAt(i - 1) == '*') dp[0][i] = dp[0][i - 2];
        }
        for (int i = 1; i <= strLength; i++) {
            for (int j = 1; j <= patLength; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else if(p.charAt(j - 1) == '.') dp[i][j] = dp[i - 1][j - 1];
                else if(p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) != s.charAt(i - 1)) dp[i][j] = dp[i][j - 2];
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        if(dp[i][j - 1] || dp[i - 1][j] || dp[i][j - 2]) dp[i][j] = true;
                    }
                }
            }
        }
        return dp[strLength][patLength];
    }
}
