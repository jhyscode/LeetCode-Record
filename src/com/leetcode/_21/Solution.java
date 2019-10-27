package com.leetcode._21;

import java.util.List;

/**
 * 递归 + 原地斩链相连
 * 递归比较查看两个链表哪个元素先小 就斩断此元素位置链条⛓连接到另一链表上 如此也不需要另外开辟存储空间
 * 斩断后,重连铁链的动作因为要自动非人工 所以需要程序自己调用自己,即为递归
 * 斩断后需要连的结点 通过 return 最小结点 即动态更新 斩断结点位置
 * 随时连接下一个符合要求的位置（x.next = 求下一个需要连接的结点位置(即程序自动搜索即递归) && x = 下一个需要连接的结点位置）
 * 返回修改后的 l1头结点的链表 或 l2头结点的链表
 *
 * @author jhys
 * @date 2019/10/27
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    //递归写法
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     if (l1 == null) {
         return l2;
     }
     if (l2 == null) {
         return l1;
     }

     if (l1.val < l2.val) {
         l1.next = mergeTwoLists(l1.next, l2);
         return l1;
     } else {     // l2 <= l1的情况
         l2.next = mergeTwoLists(l1, l2.next);
         return l2;
     }
    }

    //非递归写法
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode tmp = new ListNode(0);
        ListNode res = tmp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        ListNode result = new Solution().mergeTwoLists1(l1, l2);
        System.out.println(result);
    }
}

