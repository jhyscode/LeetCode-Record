package com.leetcode._406;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 根据身高重建队列
 * @author ：jhys
 * @date ：Created in 2021/6/20 20:47
 * @Description ：
 */
public class Solution {
    public static int[][] reconstructQueue(int[][] people) {
        //遇到两个维度的，要先确定好一个维度
        List<int[]> list = new ArrayList<>();
        for (int[] person : people) {
            list.add(person);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];  //按照升高降序
                } else {
                    return o1[1] - o2[1]; //按照人数升序
                }
            }
        });
        //将身高由高到低排序，准备一个新list集合，按照k来插入，后续的节点不会影响前面的。
        List<int[]> res = new ArrayList<>(list.size());
        for (int[] temp: list) {
            res.add(temp[1], temp);
        }
        int[][] ans = new int[people.length][people[0].length];
        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i)[0];
            ans[i][1] = res.get(i)[1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] params = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        reconstructQueue(params);
    }
}
