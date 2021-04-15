package com.leetcode._124;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/9 16:26
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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    // 函数功能：返回当前节点能为父亲提供的贡献，需要结合上面的图来看！
    private int dfs(TreeNode root) {
        // 如果当前节点为叶子节点，那么对父亲贡献为 0
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        // 当前子树内部的最大路径和
        int innerSum = left + right + root.val;
        maxSum = Math.max(maxSum, innerSum);

        // 当前子树对外提供的最大和
        int outputMaxSum = root.val + Math.max(left, right);
        return outputMaxSum < 0 ? 0 : outputMaxSum;
    }
}
