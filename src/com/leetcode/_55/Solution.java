package com.leetcode._55;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/2 18:51
 * @Description ：
 */
public class Solution {

    public static boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
}
