package com.leetcode._103;

import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/26 22:46
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            queue.offer(root);
        }
        List<Integer> list ;
        while (!queue.isEmpty()) {
            int size = queue.size(); //当前层，元素的数量
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll(); //按顺序弹出队列元素，加入集合
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left); //当前元素的左子树入队，即把下一层的元素加入队列
                }
                if (node.right != null) {
                    queue.offer(node.right); //当前元素的右子树入队，即把下一层的元素加入队列
                }
            }
            if (res.size() % 2 == 1) { //本题中奇数层要翻转下
                Collections.reverse(list);
            }
            res.add(list);
        }
        return res;
    }
}
