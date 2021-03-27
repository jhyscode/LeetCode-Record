package com.leetcode._19;

import java.util.List;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/23 22:31
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode aux = new ListNode(0);
        aux.next = head;
        ListNode pre = aux, cur = aux;
        for (int i = 0; i <= n; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;
        return aux.next;
    }
}
