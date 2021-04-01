package com.leetcode._338;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/30 17:02
 * @Description ：
 */
public class Solution {

    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num ; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x = x & (x - 1);
            ones++;
        }
        return ones;
    }
}
