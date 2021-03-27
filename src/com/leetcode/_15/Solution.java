package com.leetcode._15;

import java.util.*;

/**
 * @author jhys
 * @date 2019/10/21
 */
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        HashSet<List<Integer>> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length-2;i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        hashSet.add(list);
                    }
                }
            }
        }
        lists.addAll(hashSet);
        return lists;
    }

    /**
     * 排序+双指针，易懂图解
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int tmp = nums[i] + nums[left] + nums[right];
                if (tmp == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left += 1;
                    while (left < right && nums[right] == nums[right - 1])
                        right -= 1;
                    left += 1;
                    right -= 1;
                } else if (tmp > 0)
                    right -= 1;
                else
                    left += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
//        System.out.println(threeSum(arr));
        System.out.println(threeSum2(arr));
    }
}