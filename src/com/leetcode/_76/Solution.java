package com.leetcode._76;

import sun.plugin2.os.windows.Windows;

import java.util.HashSet;
import java.util.ServiceConfigurationError;
import java.util.Set;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/30 11:19
 * @Description ：
 */
public class Solution {

    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }
        int[] needs = new int[128];
        int[] window = new int[128];
        for (int i = 0; i < t.length(); i++) {
            needs[t.charAt(i)]++;
        }
        int left = 0;
        int right = 0;
        String minString = "";
        //目前有多少个字符
        int count = 0;
        //用来记录最短需要多少个字符。
        int minLength = s.length() + 1;

        while (right < s.length()) {
            char ch = s.charAt(left);
            window[ch]++;
            if (needs[ch] > 0 && needs[ch] >= window[ch]) {
                count++;
            }
            // 当需要的字符都已经包含在窗口中后，开始收缩 left
            while (count == t.length()) {
                ch = s.charAt(left);
                // 当需要删除的字符，是必须留在窗口内时
                if (needs[ch] > 0 && needs[ch] == window[ch]) {
                    count--;
                }
                // 这边需要取 = ，因为可能一开始两个字符串就是匹配的，如 a , a return a
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minString = s.substring(left, right + 1);
                }
                window[ch]--;
                left++;
            }
            right++;
        }
        return minString;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
