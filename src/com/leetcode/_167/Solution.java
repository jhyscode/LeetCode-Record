package com.offer._167;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/15 22:07
 * @Description ：
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) {
            return null;
        }
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i+1, j+1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
