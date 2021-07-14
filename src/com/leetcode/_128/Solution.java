package com.leetcode._128;

import java.util.HashSet;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/20 16:24
 * @Description ：
 */

public class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return n;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int maxLength = Integer.MIN_VALUE;
        for (int a : set) {
            if (set.contains(a - 1)) {
                continue;
            } else {
                int len = 0;
                while (set.contains(a++)) {
                    len++;
                }
                maxLength = Math.max(len, maxLength);
            }
        }
        return maxLength;
    }
}
