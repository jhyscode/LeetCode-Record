package com.leetcode;

import com.sun.media.sound.DLSInfo;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/25 21:03
 * @Description ：
 */
public class Binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5};
        find(arr, 3);
    }

    public static int find(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] >= key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (left < arr.length && arr[left] == key) {
            return left;
        }
        return -1;
    }
}
