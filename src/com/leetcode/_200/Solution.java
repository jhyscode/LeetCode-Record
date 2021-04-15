package com.leetcode._200;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/8 10:26
 * @Description ：
 */
public class Solution {

    private int res = 0;
    public int numIslands(char[][] grid) {
        for (int i = 0; i < grid.length; i++) { //行
            for (int j = 0; j < grid[0].length; j++) { //列
                if (grid[i][j] == '1') {
                    dfsGrid(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfsGrid(char[][] grid, int row, int col) {
        if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
            return;
        }

        if (grid[row][col] != '1') {
            return;
        }
        grid[row][col] = '2';
        dfsGrid(grid, row - 1, col);
        dfsGrid(grid, row + 1, col);
        dfsGrid(grid, row, col - 1);
        dfsGrid(grid, row, col + 1);
    }
}
