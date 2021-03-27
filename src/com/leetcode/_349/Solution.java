package com.leetcode._349;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/23 21:43
 * @Description ：
 */
public class Solution {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> resSet = new LinkedHashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resSet.add(nums2[i]);
            }
        }
        int i = 0;
        int[] res = new int[resSet.size()];
        for (Integer num : resSet) {
            res[i++] = num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] temp = intersection(nums1, nums2);
    }

}
