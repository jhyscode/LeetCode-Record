package com.leetcode._53;

import javax.lang.model.type.IntersectionType;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/30 16:21
 * @Description ：
 */
public class Solution {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0]; //跟踪dp的最大值
        for (int i = 1; i < n; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        int[] arr = {-1, -2};
        System.out.println(maxSubArray(arr));
    }
}
