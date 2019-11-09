package com.leetcode._35;

import java.lang.invoke.SerializedLambda;

/**
 * @author jhys
 * @date 2019/11/9
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,4));
    }
}
