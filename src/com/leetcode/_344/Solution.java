package com.leetcode._344;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/20 22:09
 * @Description ：
 */
public class Solution {
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0, j = len - 1; j >= i; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        char[] params = {'h','e','l','l','o'};
        reverseString(params);
    }
}
