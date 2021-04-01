package com.leetcode._136;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/29 22:15
 * @Description ：
 */
public class Solution {
    public static int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//            if(!map.containsKey(nums[i])) {
//                map.put(nums[i],1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,4,4};
        System.out.println(singleNumber(arr));
    }

}
