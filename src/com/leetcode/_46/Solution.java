package com.leetcode._46;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/26 19:08
 * @Description ：
 */
public class Solution {
    //存放结果
    static List<List<Integer>> result = new ArrayList<>();
    //暂存结果
    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {
        boolean[]used = new boolean[nums.length];
        backTrack(nums,used);
        return result;
    }

    private static void backTrack(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == true) {
                continue;// path⾥已经收录的元素，直接跳过
            }
            used[i] = true;
            path.add(nums[i]);
            backTrack(nums, used);
            path.remove(path.size() - 1);//回溯
            used[i] = false;//回溯
        }
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine().toString();
//        String[] arr1 = str.split(" ");
//        int[] input = new int[arr1.length];
//        for (int i = 0; i < arr1.length ; i++) {
//            input[i] = Integer.parseInt(arr1[i]);
//        }
        int[] input = {1,2,3};
        System.out.println(permute(input));
    }
}
