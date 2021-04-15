package com.leetcode.程序员面试经典._1617;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/10 10:20
 * @Description ：
 */

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
