package com.leetcode._13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jhys
 * @date 2019/10/20
 */
public class Solution {
    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Illegal character");
        }
    }

    public static int romanToInt(String s) {
        int result = 0, i = 0, n = s.length();
        while (i < n) {
            int current = getValue(s.charAt(i));
            if (i == n - 1 || current >= getValue(s.charAt(i + 1))) {
                result += current;
            } else {
                result -= current;
            }
            i++;
        }
        return result;
    }

    public static int romanToInt2(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        int result = 0;
        int i = 0;
        while (i < length) {
            if (i < length - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i += 2;
            } else {
                result += map.get(s.charAt(i));
                i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt2("IV"));
    }
}