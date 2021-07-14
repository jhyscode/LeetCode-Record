package com.leetcode._743;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/** 其实就是最短路径问题，求出点K到其他各点的最短距离再找出其中的最大距离
 *  DisjKstra算法-邻接矩阵版
 * @author ：jhys
 * @date ：Created in 2021/7/7 21:36
 * @Description ：
 */
public class Solution {
    public static int networkDelayTime(int[][] times, int n, int k) {
        int INF = 1000000000;	//表示无穷远
        int max = -1;//最大距离
        int[][] graph = new int[n+1][n+1];//矩阵
        boolean[] flag = new boolean[n+1];//标志
        int[] path = new int[n+1];//点K到各点的最短距离
        for ( int i = 1; i < graph.length; i++ ) {//初始化
            for ( int j = 1; j < graph[i].length; j++ ) {
                graph[i][j] = INF;
            }
        }
        for ( int[] time : times ) {//读入边
            graph[time[0]][time[1]] = time[2];
        }
        for ( int i = 1; i < path.length; i++ ) path[i] = 1000000000;
        path[k] = 0;

        while ( true ) {
            int index = -1;
            int min = Integer.MAX_VALUE;

            for ( int i = 1; i < graph.length; i++ ) {	//找出最小值
                if ( path[i] < min && !flag[i] ) {	//没有判定距离是否为无限距离，此处不影响
                    min = path[i];
                    index = i;
                }
            }

            if ( index == -1 ) break;
            flag[index] = true;

            for ( int i = 1; i < graph[index].length; i++ ) {	//优化
                if ( graph[index][i] != INF && !flag[i] && path[index] + graph[index][i] < path[i] ) {
                    path[i] = path[index] + graph[index][i];
                }
            }
        }

        for ( int i = 1; i < path.length; i++ ) {//找出最大距离
            if ( path[i] == INF ) return -1;
            else if ( max < path[i] ) max = path[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        int temp = networkDelayTime(arr, n, k);
    }
}
