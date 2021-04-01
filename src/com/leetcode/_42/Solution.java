package com.leetcode._42;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/30 15:29
 * @Description ：
 */
public class Solution {
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (i == 0 || i == height.length - 1) {
                continue;
            }
            int rHeight = height[i]; //跟踪右侧最大值
            int lHeight = height[i];
            for (int r = i + 1; r < height.length; r++) {
                if (height[r] > rHeight) {
                    rHeight = height[r];
                }
            }
            for (int l = i - 1; l >= 0; l--) {
                if (height[l] > lHeight) {
                    lHeight = height[l];
                }
            }
            int h = Math.min(lHeight, rHeight) - height[i];
            if (h > 0) {
                sum += h;
            }
        }
        return sum;
    }
}
