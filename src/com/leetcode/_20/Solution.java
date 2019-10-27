package com.leetcode._20;

import java.util.Stack;

/**
 * 1.分析题目很明显是栈问题，所以如何利用好push和pop是一个技术突破口。
 * 2.当for循环完，也就是stack该pop的已经pop，如果stack为空，则证明括号一一对应，则返回true
 * 3.以此判断([{,然后其对应的右字符进栈，再出栈，判断是否相等
 *
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
            } else if (chars[i] == '[') {
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
