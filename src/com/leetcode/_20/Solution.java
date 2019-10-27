package com.leetcode._20;

import java.util.Stack;
/**
 * @author jhys
 * @date 2019/10/27
 */
public class Solution {
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '{') {
                stack.push('}');
            } else if (chars[i] =='[') {
                stack.push(']');
            } else if (chars[i] == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || chars[i] != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
