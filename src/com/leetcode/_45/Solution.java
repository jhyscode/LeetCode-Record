package com.leetcode._45;

import java.util.Arrays;

/**
 * This is an implicit bfs solution. i == curEnd means you visited all the items on the current level. Incrementing jumps++ is like incrementing the level you are on.
 * And curEnd = curFarthest is like getting the queue size (level size) for the next level you are traversing.
 * @author ：jhys
 * @date ：Created in 2021/4/15 15:40
 * @Description ：
 */
public class Solution {
    public static int jump(int[] nums) {
        int steps = 0;
        int end = 0;
        int maxPos = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxPos = Math.max(maxPos, nums[i] + i);
            if (i == end) {
                end = maxPos;
                ++steps;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
    }
}
