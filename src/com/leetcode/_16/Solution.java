package com.leetcode._16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 双指针法的代码实现
 * 利用 Arrays.sort(nums) 对数组进行排序。
 * 初始化一个用于保存结果的值 result = nusm[0] + nums[1] + nums[2] （不要自己设初值，直接从数组中抽取三个元素，假设这是最接近的三数之和，然后再更新就是了）。
 * 利用下标 i 对数组进行遍历，此时就是在固定第一个元素，注意，下标 i 的边界为 i < nums.length-2，否则设置指针的时候会出现数组越界。
 * 每次遍历的过程中设置两个指针，分别是 left = i + 1、right = nums.length - 1。
 * 检查 sum = nums[i] + nums[left] + nums[right]与 target 的距离，如果该距离比之前保存的 result 与 target 的距离更小，就更新 result。
 * 然后就是移动双指针。
 * 如果 sum 的值比 target 大，那么我们让 right--，因为数组是有序的，right --会使得下一次的 sum 更小，也就更接近 target 的值
 * 同理，如果 sum 的值 target 小，那么我们让 left++。·
 * left++ 和 right-- 的界限自然是 left != right，如果 left == right，说明我们已经将所有的元素都遍历过一遍了。
 * 重复上面的操作，直到i循环结束为止，返回 result。
 *
 * @author jhys
 * @date 2019/10/22
 */
public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left != right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
                if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        System.out.println(threeSumClosest(arr,0));
    }
}
