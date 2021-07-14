package com.leetcode._287;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/20 14:14
 * @Description ：
 */

public class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int left = 1;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int cnt = 0;
            //遍历所有的数字，小于等于mid的进行计数
            for (int num : nums) {
                if (num <= mid) {
                    cnt += 1;
                }
            }
            if (cnt > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
