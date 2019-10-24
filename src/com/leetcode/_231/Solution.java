package com.leetcode._231;

/**
 * @author jhys
 * @date 2019/10/2
 */
public class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        if (n % 2 == 1) {
            return false;
        } else {
            while (n != 0) {
                if(n == 2) {
                    return true;
                }
                n = n / 2;
                if(n % 2 == 1 ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1022));
    }
}
