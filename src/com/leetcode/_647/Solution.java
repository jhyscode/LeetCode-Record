package com.leetcode._647;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 18:39
 * @Description ：
 */
public class Solution {

    public static int countSubstrings(String s) {
        return 0;
    }

    public static boolean isPali(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPali("ababa"));
    }
}
