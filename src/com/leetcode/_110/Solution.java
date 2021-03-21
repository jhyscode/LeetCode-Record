package com.leetcode._110;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/16 21:31
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


    public boolean isBalanced(TreeNode root) {
      if (root == null) {
          return true;
      }
      return Math.abs(depth(root.left) - depth(root.right)) <= 1 && isBalanced(root.left)
              && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right)) + 1;
    }


}
