package com.leetcode._69;

/**
 * @author jhys
 * @date 2019/10/2
 */
public class Solution {
    public static int mySqrt(int x) {
        long res = 0;
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        for(long i = 1;i < x;i++) {
            if(i*i <= x && (i+1)*(i+1) > x) {
                res = i;
                break;
            }
        }
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
