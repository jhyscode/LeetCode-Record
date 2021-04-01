package com.leetcode._31;

import java.util.Arrays;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 23:27
 * @Description ：
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;
        for(i = n - 1; i > 0; i--){
            if(nums[i] > nums[i-1]){
                int swapi = i;
                for(int j = i+1; j < n; j++){
                    if(nums[j] > nums[i-1] && nums[j] < nums[swapi]){
                        swapi = j;
                    }
                }
                swap(nums,i-1,swapi);
                break;
            }
        }
        Arrays.sort(nums,i,n);
    }
    void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
