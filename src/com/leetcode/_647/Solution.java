package com.leetcode._647;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 18:39
 * @Description ：
 */
public class Solution {

    public static int countSubstrings(String s) {
        if(s == null || s.equals("")){
            return 0;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)){
                    if (j - i <= 1){
                        ans++;
                        dp[i][j] = true;
                    } else if (dp[i + 1][j - 1]) {
                        ans++;
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}
