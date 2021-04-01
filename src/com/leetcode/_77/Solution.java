package com.leetcode._77;

import java.text.DateFormatSymbols;
import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/28 21:51
 * @Description ：
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        backtrack(n, k, 1, path, res);
        return res;
    }

    public void backtrack(int n, int k, int index, Deque<Integer> path, List<List<Integer>> res ) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            backtrack(n, k, i+1, path, res);
            path.removeLast();
        }
    }
}
