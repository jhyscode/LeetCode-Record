package com.leetcode._48;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/2 17:02
 * @Description ：
 */
public class Solution {

    public void rotate(int[][] matrix) {
        int s = 0, e = matrix.length - 1;
        while(s < e){
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++; e--;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
