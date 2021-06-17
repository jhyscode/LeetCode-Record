package com.leetcode;

import javax.lang.model.type.IntersectionType;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

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
//        System.out.println(Integer.parseInt("42"));
//        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(5));
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

// Java code to demonstrate push() method


class GfG {
    // Main method
    public static void main(String[] args)
    {

        // Creating a LinkedList object to represent a stack.
        LinkedList<String> stack = new LinkedList<>();

        // Pushing an element in the stack
        stack.push("I");

        // Pushing an element in the stack
        stack.push("Like");

        // Pushing an element in the stack
        stack.push("GeeksforGeeks");

        // Printing the complete stack.
        System.out.println(stack.pop());
    }
}