package com.leetcode._617;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 15:56
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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }
        TreeNode root3= new TreeNode(root1.val + root2.val);
        root3.left = mergeTrees(root1.left, root2.left);
        root3.right = mergeTrees(root1.right, root2.right);
        return root3;

    }
}
