package com.leetcode._49;

import java.util.*;

/**
 * @author ：jhys
 * @date ：Created in 2021/4/2 21:09
 * @Description ：
 */
public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            //新建一个list，第一次查询到key为空的时候，什么也不做，只新建list，第二次再和key进行比较；
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
