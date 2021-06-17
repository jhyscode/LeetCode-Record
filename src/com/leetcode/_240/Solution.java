package com.leetcode._240;

import com.sun.org.apache.bcel.internal.generic.IFGE;

/**
 * @author ：jhys
 * @date ：Created in 2021/6/4 11:17
 * @Description ：
 */
public class Solution {
    //从左下角开始进行比较
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int i = m - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}
