package com.leetcode._322;

import javax.crypto.Cipher;
import java.util.Arrays;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/29 10:23
 * @Description ：
 */
public class Solution {


    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount ; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        if (dp[amount] == max) {
            return -1;
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int amout = 11;
        int temp = coinChange(arr, amout);
        System.out.println(temp);
    }

}
