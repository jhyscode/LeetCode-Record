package com.leetcode._17;

import java.util.*;

/**
 * @author jhys
 * @date 2019/10/26
 */
public class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList();
        }
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> res = new LinkedList<String>();
        helper("", digits, 0, res, map);
        return res;
    }

    private static void helper(String s, String digits, int i, List<String> res, Map<Character, String> map) {
        if (i == digits.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j++) {
            helper(s + letters.charAt(j), digits, i + 1, res, map);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

}

class Solutuion1 {
    List<String> ans = new ArrayList<>();
    Map<String, String> map = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0 || digits == null)
            return ans;
        dfs(digits, 0, "");
        return ans;
    }

    public void dfs(String digits, int step, String answer) {
        if (step == digits.length()) {
            ans.add(answer);
            return;
        }

        char c = digits.charAt(step);
        String value = map.get(c + "");
        for (int i = 0; i < value.length(); i++) {
            dfs(digits, step + 1, answer + value.charAt(i));
        }
    }
}