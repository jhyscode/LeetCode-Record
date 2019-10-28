package com.leetcode._22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jhys
 * @date 2019/10/28
 */
public class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> strings = new ArrayList<>();
        if (n == 0) {
            return strings;
        }
        dfs(0, 0, "", strings, n);
        return strings;
    }
    private static void dfs(int left,int right,String buffer,List<String> strings,int n) {
        if (left == n && right == n) {
            strings.add(buffer);
            return;
        }
        //可以添加一个左括号
        if (left < n) {
            dfs(left + 1, right, buffer + "(", strings, n);
        }
        //添加一个右括号
        if (left > right) {
            dfs(left, right + 1, buffer + ")", strings, n);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
