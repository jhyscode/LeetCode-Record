package com.leetcode._3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem3
 * @author jhys
 * @date 2019/9/27
 */

/**
 * 使用HashMap记录字符上次出现的位置，用pre记录最近重复字符出现的位置，
 * 则i(当前位置)-pre就是当前字符最长无重复字符的长度，取最大的就是字符串的最长无重复字符的长度
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int pre = -1;
        for (int i = 0, strLen = s.length(); i < strLen; i++) {
            Character ch = s.charAt(i);
            Integer index = map.get(ch);
            if (index != null) {
                pre = Math.max(pre,index);
            }
            max = Math.max(max,i-pre);
            map.put(ch,i);
        }
        return max;
    }

    public static void main(String[] args) {
        int temp = lengthOfLongestSubstring("abcaa");
        System.out.println(temp);
    }
}

class Solution2 {
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>(); //初始化一个hashset
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        int start = 0,end = s.length();
        allUnique(s,start,end);
    }
}