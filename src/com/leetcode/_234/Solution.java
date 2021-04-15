package com.leetcode._234;

import java.util.Stack;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/8 10:07
 * @Description ：
 */
class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        //挨个遍历链表的节点，并依次压入栈中
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()) {
            if (head.val == stack.pop().val) {
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }
}