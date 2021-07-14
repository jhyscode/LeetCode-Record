package com.leetcode._347;

import java.awt.font.NumericShaper;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：jhys
 * @date ：Created in 2021/7/5 22:08
 * @Description ：
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];    // 结果数组
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int maxTimes = 0; // 出现最多的元素的出现次数
        // 找出出现次数最多的元素出现的次数
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxTimes) {
                maxTimes = entry.getValue();
            }
        }
        // 按出现次数从大到小添加到结果数组
        while (k > 0) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxTimes) {
                    res[k - 1] = entry.getKey();
                    k--;
                }
            }
            maxTimes--;
        }
        return res;
    }
}
