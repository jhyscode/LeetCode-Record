package com.leetcode._58;

/**
 * 从右向左遍历，从第一个不是空格的字符开始计数，一旦开始计数，再遇到空格就结束了
 * @author ：jhys
 * @date ：Created in 2021/4/24 23:51
 * @Description ：
 */

public class Solution {
    public static int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' '){
                if(count == 0) continue;
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        lengthOfLastWord(new String("Hello World"));
    }
}
