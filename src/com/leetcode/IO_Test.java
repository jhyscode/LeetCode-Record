package com.leetcode;

/**
 * @author ：jhys
 * @date ：Created in 2021/3/24 23:58
 * @Description ：
 */
import java.util.Scanner;
public class IO_Test {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++) {
            int num1 = scanner.nextInt();
            int sum = 0;
            for(int j = 0; j < num1; j++) {
                sum = sum + scanner.nextInt();
            }
            System.out.println(sum);
        }
    }
}