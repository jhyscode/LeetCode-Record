package com.leetcode._39;

import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 20:10
 * @Description ：
 */
public class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        //双端队列
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, 0, len, target, path);
        return res;
    }

    private void dfs(int[] candidates, int start, int len, int target,Deque<Integer> path) {
        // target 为负数和 0 的时候不再产生新的孩子结点
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        // 重点理解这里从 start 开始搜索的语意 ,组合问题，用start排除已经选过的数字
        for (int i = start; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, len, target - candidates[i], path);
            path.removeLast();
        }
    }
}
