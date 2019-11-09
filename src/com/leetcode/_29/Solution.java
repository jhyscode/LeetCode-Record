package com.leetcode._29;

/**
 * @author jhys
 * @date 2019/11/8
 */

/**
 * 如果感觉迷糊，看个运算实例就懂了，
 * 假设被除数 dividend = 20，除数 divisor = 3。
 * 加速试减法的流程如下：
 *
 * dividend = 20 - 3 = 17，divisor = 3，k = 1，result = 1（result 为最终要返回的结果）
 * dividend = 17 - 3*2 = 11，divisor = 6，k = 2，result = 3（将 k 累加进 result）
 * dividend = 11 - 6*2 = -1，dividend < 0，则 divisor = 3，k = 1
 * dividend = 11 - 3 = 8，divisor = 3，k = 1，result = 4
 * dividend = 8 - 3*2 = 2，divisor = 6，k = 2，result = 6
 * dividend = 2 - 6*2 = -10，dividend < 0，则 divisor = 3，k = 1
 * dividend = 2 - 3 = -1，dividend < 0，又 k == 1，算法结束，result = 6
 * 所以 20 除 3 的商就为 6。
 *
 */
public class Solution {
    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == Integer.MIN_VALUE){ // 此处如不特判，后面会陷入死循环
            if(dividend == Integer.MIN_VALUE) return 1;
            else return 0;
        }
        if(divisor == -1) return -dividend;
        if(divisor == 1) return dividend;
        boolean d = true; // 同号标志
        if(dividend <= 0 && divisor > 0){
            d = false;
            divisor = -divisor;
        }else if(dividend >= 0 && divisor < 0){
            d = false;
            dividend = -dividend;
        }else if(dividend >= 0 && divisor > 0){
            dividend = -dividend;
            divisor = -divisor;
        }
        int div = divisor, k = 1, result = 0;
        final int bound = Integer.MIN_VALUE >> 1;
        while(true){
            dividend -= div;
            if(dividend > 0){
                if(k == 1) return d == true ? result : -result;
                else{
                    dividend += div;
                    div = divisor;
                    k = 1;
                    continue;
                }
            }
            result += k;
            if(div >= bound){ // ****溢出判断，不能让 div 左移后溢出了
                div <<= 1;
                k <<= 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(29,8));
    }
}

/**
 * 二进制相关的形式来实现。”<<”和”>>”分别为将数的整体左移和右移，例如a<<1表示将a向左移动一位，即变为原来的二倍。
 *
 * 思路:当被除数大于等于除数时(否则的话就为0了)，我们设置两个变量t和p，并分别初始化为除数和1(最小的情况)，
 * 当被除数大于等于t的二倍时，将t和p同时扩大二倍(左移)，并将返回值加上p，除数减去t。和二进制类似，
 * 例如29除以8，8扩大二倍，16小于29，再扩大二倍，超过29，于是29减去之前的16，返回值加上2。
 * 第二次循环时因为此时的13小于8的二倍，故加上1，整个循环结束，最终结果为2+1=3，很明显符合。
 * 此外注意判断结果正负号的正负号时亦或的作用。 代码如下:
 */
class Solution2 {
    public static int divide(int dividend, int divisor) {
        if(divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)){//考虑特殊情况
            return Integer.MAX_VALUE;
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;//异或运算
        long ms = (long)dividend;
        long ns = (long)divisor;
        ms = Math.abs(ms); //被除数
        ns = Math.abs(ns); //除数
        int num = 0;
        while(ms >= ns){
            long m = ns;
            long n = 1;
            while(ms >= (m << 1)){
                m <<= 1;
                n <<= 1;
            }
            num += n;
            ms -= m;
        }
        return num * sign;
    }

    public static void main(String[] args) {
        int res = divide(29,8);
    }
}
