package com.leetcode._139;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/24 19:29
 * @Description ：
 */
public class Solution {
    public HashMap<String, Boolean> hash = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        //方便check，构建一个哈希表
        for (String word : wordDict) {
            hash.put(word, true);
        }
        //初始化
        dp[0] = true;

        //遍历
        for (int j = 1; j <= s.length(); j++) {
            for (int i = j - 1; i >= 0; i--) {
                dp[j] = dp[i] && check(s.substring(i, j));
                if (dp[j]) {
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public boolean check (String s) {
        return hash.getOrDefault(s, false);
    }
}
