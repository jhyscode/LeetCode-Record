package com.leetcode._739;

import java.util.Arrays;
import java.util.Stack;
import java.util.logging.Level;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/4 10:48
 * @Description ：
 */
public class Solution {
    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        // 该位置用0代替，因此默认值设置为0
        Arrays.fill(res, 0);
        Stack<Integer> stack = new Stack<>();
        // 开始正向遍历
        stack.push(0);
        for (int i = 1; i < T.length; i++) {
          if (T[i] < T[stack.peek()]) {
              stack.push(i);
          } else if (T[i] == T[stack.peek()]) {
              stack.push(i);
          } else {
              while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                  res[stack.peek()] = i - stack.peek();
                  stack.pop();
              }
              stack.push(i);
          }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(dailyTemperatures(arr));
    }
}
