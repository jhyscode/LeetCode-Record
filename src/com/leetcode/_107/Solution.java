package com.leetcode._107;

import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/7/17 18:04
 * @Description ：
 */

public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(levelList);
        }
        Collections.reverse(res);
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}