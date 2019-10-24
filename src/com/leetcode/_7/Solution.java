package com.leetcode._7;

import javax.sound.sampled.ReverbType;

/**
 * @author jhys
 * @date 2019/9/28
 */
public class Solution {
    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            result = 0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        reverse(123);
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
}
