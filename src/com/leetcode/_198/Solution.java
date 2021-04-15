package com.leetcode._198;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 8:49
 * @Description ：
 */
public class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if( nums.length >= 2) {
            dp[1] = Math.max(nums[0],nums[1]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[nums.length];
    }
}
