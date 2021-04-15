package com.leetcode._283;

import javax.swing.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/9 20:45
 * @Description ：
 */
public class Solution {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        //nums[index]保存nums中不为零的数，最后补零
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3};
        moveZeroes(arr);
    }
}
