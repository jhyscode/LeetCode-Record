package com.leetcode._633;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/15 22:17
 * @Description ：
 */
public class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        int i = 0, j = (int)Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
