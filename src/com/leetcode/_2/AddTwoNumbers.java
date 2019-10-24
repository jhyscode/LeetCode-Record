package com.leetcode._2;

/**
 * Problem2
 * @author jhys
 * @date 2019/9/22
 */
public class AddTwoNumbers {
    public static class ListNode {
        //嵌套类
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private  ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode n1 = l1,n2 = l2, t = node;
        int sum = 0;
        while(n1 != null || n2 != null) {
            sum /= 10;
            if(n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }
            t.next = new ListNode(sum % 10);
            t = t.next;
        }
        if (sum/10 != 0)
            t.next = new ListNode(1);
        return node.next;
    }
    public static void main(String[] args) {

        ListNode node = new ListNode(2);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);

        ListNode node1 = new ListNode(5);
        node1.next = new ListNode(6);
        node1.next.next = new ListNode(4);
        ListNode result = new AddTwoNumbers().addTwoNumbers(node,node1);
    }

}
