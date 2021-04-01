package com.leetcode._518;

import java.util.Arrays;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/29 16:31
 * @Description ：
 */
public class Solution {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
