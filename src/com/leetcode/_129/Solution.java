package com.leetcode._129;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/24 17:28
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

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int preSum) {
        if (root == null) {
            return 0;
        }
        int sum = preSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            //如果当前节点不是叶子结点，返回左右子节点的路径和
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }
}
