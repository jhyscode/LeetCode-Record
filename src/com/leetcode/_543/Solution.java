package com.leetcode._543;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 17:26
 * @Description ：
 */
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

public class Solution {
    int maxDepth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxDepth;
    }
    public int depth (TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        maxDepth = Math.max(left + right, maxDepth);
        return Math.max(left, right) + 1;
    }
}
