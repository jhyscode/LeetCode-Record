package com.leetcode._3;

import java.util.*;

/**
 * Problem3
 * @author jhys
 * @date 2019/9/27
 */

/**
 * Java Sliding Window based on Queue
 * 使用HashMap记录字符上次出现的位置，用pre记录最近重复字符出现的位置，
 * 则i(当前位置)-pre就是当前字符最长无重复字符的长度，取最大的就是字符串的最长无重复字符的长度
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for(char c : s.toCharArray()) {
            while(queue.contains(c)) {
                queue.poll();
            }
            queue.offer(c);
            res = Math.max(res, queue.size());
        }
        return res;
        }


    public static void main(String[] args) {
        int temp = lengthOfLongestSubstring("abccdbfa");
        System.out.println(temp);
    }
}
