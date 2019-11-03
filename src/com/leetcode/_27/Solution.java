package com.leetcode._27;

/**
 * @author jhys
 * @date 2019/11/3
 */
public class Solution {
    public static  int removeElement(int[] nums, int val) {
        int ans = 0;
        for (int num : nums) {
            if (num != val) {
                nums[ans] = num;
                ans ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,5};
        System.out.println(removeElement(arr,2));
    }
}
