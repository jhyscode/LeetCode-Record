package com.leetcode._5;


/**
 * @author jhys
 * @date 2019/10/2
 */
public class Solution {
    public static String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        boolean[][] dp = new boolean[n][n];
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j-i<2 || dp[i+1][j-1]);
                if (dp[i][j] && j-i+1> res.length()) {
                    res = s.substring(i,j+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(longestPalindrome(str));
    }
}

class Solution2 {
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        // 第一维参数表示起始位置坐标，第二维参数表示终点坐标
        // lps[j][i] 表示以 j 为起始坐标，i 为终点坐标是否为回文子串
        boolean[][] lps =  new boolean[length][length];
        int maxLen = 1; //记录最长回文子串最长长度
        int start = 0; //记录最长会问字串的起始位置
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i-j < 2) {
                    //字符串长度小于2的时候单独处理
                    lps[j][i] = (chars[i] == chars[j]);
                } else {
                    // 如果 [i, j] 是回文子串，那么一定有 [j+1, i-1] 也是回子串
                    lps[j][i] = lps[j+1][i-1] && (chars[j] == chars[i]);
                }
                if (lps[j][i] && (i-j+1) > maxLen) {
                    maxLen = i-j+1;
                    start = j;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }

    public static void main(String[] args) {
        String str = "bb";
        System.out.println(longestPalindrome(str));
    }
}