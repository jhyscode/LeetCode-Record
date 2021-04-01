package com.leetcode._125;

import java.util.Scanner;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 18:52
 * @Description ：
 */
public class Solution {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        char left = ' ';
        char right = ' ';
        while(i <= j) {
            //找左边第一个合法的
            while (i < j && !isValid(arr[i])) {
                i++;
            }
            left = arr[i];
            while (i < j && !isValid(arr[j])) {
                j--;
            }
            right = arr[j];
            if (left == right || Math.abs(left - right) == 32 && (left >= 'a' && left <= 'z' || left >= 'A' && left <= 'Z')
             &&  (right >= 'a' && right <= 'z' || right >= 'A' && right <= 'Z')) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(char c) {
        if (c >= '0' && c <= '9' || c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String s = scanner.nextLine();
            char[] arr = s.toCharArray();
            System.out.println(isPalindrome(s));
            System.out.println(arr);
        }
    }
}
