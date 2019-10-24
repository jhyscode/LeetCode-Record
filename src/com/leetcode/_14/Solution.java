package com.leetcode._14;

/**
 * @author jhys
 * @date 2019/10/21
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if( strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for(; j < ans.length() && j < strs[i].length(); j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);  //end index,exclusive
            if(ans.equals("")) {
                return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }
}
