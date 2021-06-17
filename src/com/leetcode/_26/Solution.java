package com.leetcode._26;

/**
 *
 * 双指针法,筛选不同的项，存到数组中
 * @author jhys
 * @date 2019/10/27
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int t = 0;
        for (int i = 0; i < nums.length; i ++ ) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[t++] = nums[i];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
