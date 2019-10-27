package com.leetcode._26;

/**
 * 双指针法,筛选不同的项进入数组
 * @author jhys
 * @date 2019/10/27
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length;j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
