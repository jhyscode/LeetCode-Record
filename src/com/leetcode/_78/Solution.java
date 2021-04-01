package com.leetcode._78;

import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/29 18:50
 * @Description ：
 */
public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, path, 0);
        return res;
    }

    public void backtrack(int[] nums, List<Integer> path, int start) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, path, i+1);
            path.remove(path.size() - 1);
        }
    }

}
