package com.leetcode._83;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/25 9:42
 * @Description ：
 */



public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(-109);
        ListNode tail = dummy; //tail保存不重复的值
        while (head != null) {
            // 值不相等才追加，确保了相同的节点只有第一个会被添加到答案
            if (head.val != tail.val) {
                tail.next = head;
                tail = tail.next;
            }
            head = head.next;
        }
        tail.next = null;
        return dummy.next;
    }
}




class ListNode {
    int val;
    ListNode next;
    ListNode (int x) {
        val = x;
        next = null;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}