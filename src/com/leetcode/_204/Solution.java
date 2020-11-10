package com.leetcode._204;

/**
 * @author jhys
 * @date 2019/10/1
 */
public class Solution {
    public static int countPrimes(int n) {
        int count = 1;
        for(int i =2;i<n;i++) {
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    break;
                }
                else {
//                    System.out.println(i);
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countPrimes(10));

    }


}

