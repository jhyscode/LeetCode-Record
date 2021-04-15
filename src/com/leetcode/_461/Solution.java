package com.leetcode._461;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 21:32
 * @Description ：
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y;
        int count = 0;
        while (res != 0) {
            res = res & (res - 1); //最右边等于1的比特会被移除，用于统计二进制中1的个数
            count++;
        }
        return count;
    }
}
