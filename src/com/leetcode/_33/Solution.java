package com.leetcode._33;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/2 15:30
 * @Description ：
 */
public class Solution {

    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] >= nums[0]) {
                if (target >= nums[0] && nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[n]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
