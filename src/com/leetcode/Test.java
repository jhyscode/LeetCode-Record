package com.leetcode;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jhys
 * @date 2019/9/27
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("a",2);
//        for(Map.Entry<String,Integer> entry: map.entrySet()) {
//            System.out.println(entry.getKey()+","+entry.getValue());
//        }
        System.out.println(Integer.parseInt("42"));
        System.out.println(Integer.MAX_VALUE);
    }
}

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

