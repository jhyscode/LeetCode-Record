package com.leetcode._28;

/**
 * @author jhys
 * @date 2019/11/4
 */
public class Solution {
    public static int strStr(String haystack, String needle) {
        if (needle == null) {
            return 0;
        } else {
            return haystack.indexOf(needle);
        }
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
}
