package com.leetcode._209;

import org.omg.CORBA.INTERNAL;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/29 23:37
 * @Description ：
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;   // 滑动窗口数值之和
        int i = 0;   // 滑动窗口起始位置
        int subLength = 0;  // 滑动窗口的长度
        for (int j = 0; j < nums.length ; j++) {
            sum = sum + nums[j];
            while (sum >= target) {
                subLength = j - i + 1;
                result = result < subLength ? result : subLength;
                sum = sum - nums[i++];
            }
        }
        // 如果result没有被赋值的话，就返回0，说明没有符合条件的子序列
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
