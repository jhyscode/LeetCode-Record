package com.leetcode._4;

/**
 * @author jhys
 * @date 2019/10/1
 */
public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i];
                i++;
            } else {
                nums3[k++] = nums2[j];
                j++;
            }
        }
        //补齐nums1、nums2的剩余部分
        while (i < nums1.length) {
            nums3[k++] = nums1[i];
            i++;
        }
        while (j < nums2.length) {
            nums3[k++] = nums2[j];
            j++;
        }
        if (k % 2 == 1) {
            return (double) nums3[k / 2];
        } else {
            return (double) (nums3[k / 2 - 1] + nums3[k / 2]) / 2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        findMedianSortedArrays(nums1, nums2);
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
