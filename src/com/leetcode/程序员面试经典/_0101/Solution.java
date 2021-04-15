package com.leetcode.程序员面试经典._0101;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/10 10:13
 * @Description ：
 */
public class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            if (!set.contains(astr.charAt(i))) {
                set.add(astr.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
