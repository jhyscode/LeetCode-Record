package com.leetcode._9;

/**
 * @author jhys
 * @date 2019/10/15
 */
public class Solution {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        if(x < 0) {
            return false;
        }
        for(int i=0,j=chars.length-1;i<=j;i++,j--) {
            if(chars[i] != chars[j]) {
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(121);
        System.out.println(isPalindrome(-121));
    }
}
