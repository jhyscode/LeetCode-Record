package com.leetcode._75;

import java.util.PriorityQueue;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/2 22:20
 * @Description ：
 */
public class Solution {

    public void sortColors(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!queue.isEmpty()) {
                nums[i] = queue.poll();
            }
        }
    }
}
