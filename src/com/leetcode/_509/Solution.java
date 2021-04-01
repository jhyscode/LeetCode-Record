package com.leetcode._509;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 23:31
 * @Description ：
 */
public class Solution {
    public static int fib(int n) {
        //递归出口
        if (n < 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        // base case
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
    }
}
