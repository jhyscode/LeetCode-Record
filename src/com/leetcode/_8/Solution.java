package com.leetcode._8;

/**
 * 1.首先去除字符串左右空格,不符合条件的直接return 0;
 * 2.sign是符号位,start指针指向第一个数字的位置,如果第一位为数字,
   则sign=1,start=0,否则firstChar接收字符串第一个字符,若为“+”、“-”,sign分别赋值1、-1,start自增1,
 * 3.从字符串第一个为数字的位置开始遍历,res为无符号结果,如果res大于Integer最大值且sign=1,
   输出Integer的最大值,反之输出Integer最小值,如果遍历到不为数字的字符,则直接返回res*sign;
 * 4.如果遍历时该字符串未超范围,且无非数字字符,则返回res * sign;
 *
 * @author jhys
 * @date 2019/10/4
 */
public class Solution {
    public static int myAtoi(String str) {
       if (str == null || str.length() == 0) {
           return 0;
       }
       int index = 0, base = 0, sign = 1, len = str.length();
       // 跳过空格
        while (index < len && str.charAt(index) == ' ') {
            index++;
        }
        // 获取符号位
        if (index < len && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = 1 - 2 * ((str.charAt(index++) == '-') ? 1 : 0);
        } // 只取数字，碰到非数字退出循环
        while (index < len && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            // 溢出判断，MAX_VALUE的个位为7
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(index) - '0' > 7))
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;

            base = base * 10 + str.charAt(index++) - '0';
        }

        return sign * base;

    }

    public static void main(String[] args) {
        int tmp = myAtoi("words and 987");
        System.out.println(tmp);
    }
}
