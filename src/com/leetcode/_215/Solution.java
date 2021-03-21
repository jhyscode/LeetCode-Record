package com.leetcode._215;

import java.util.PriorityQueue;

/**
 * // 使用一个含有 len 个元素的最小堆，默认是最小堆
 * @author ：jhys
 * @date ：Created in 2021/3/19 20:31
 * @Description ：
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < len; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = 0; i < len - k; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
