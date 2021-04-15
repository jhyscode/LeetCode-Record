package com.leetcode._168;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 17:12
 * @Description ：
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        // 计算前缀和数组
        int[] preSum = new int[len + 1];
        preSum[0] = 0;
        for (int i = 0; i < len; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int count = 0;
        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                // 区间和 [left..right]，注意下标偏移
                if (preSum[right + 1] - preSum[left] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
