package com.leetcode._98;

import sun.reflect.generics.tree.Tree;

import java.time.OffsetDateTime;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/19 21:14
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
    // 因为后台测试数据中有int最小值,maxVal跟踪最大值
    long maxVal = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        if (maxVal <= root.val) {
            maxVal = root.val;
        } else {
            return false;
        }
        boolean right = isValidBST(root.left);
        return left && right;
    }
}
