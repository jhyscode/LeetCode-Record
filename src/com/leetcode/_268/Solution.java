package com.leetcode._268;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/23 17:08
 * @Description ：
 */
public class Solution {

    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums) {
            numSet.add(num);
        }
        int expectedNumCount = nums.length + 1;
        for (int i = 0; i < expectedNumCount; i++) {
            if (!numSet.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        int temp = missingNumber(arr);
    }
}
