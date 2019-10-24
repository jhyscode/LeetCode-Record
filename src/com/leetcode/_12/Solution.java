package com.leetcode._12;

/**
 * 贪心算法
 * @author jhys
 * @date 2019/10/17
 */
public class Solution {
    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        int index  = 0;
        while (index < 13) {
            while(num >= nums[index]) {
                stringBuilder.append(romans[index] + "");
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1993));
    }
}
