package com.leetcode._121;

import sun.print.SunMinMaxPage;

import java.util.List;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/24 15:42
 * @Description ：
 */
public class Solution {

    public static int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }
}
