package com.qingtao.leetCode;


import java.util.LinkedList;
import java.util.List;


/**
 * @Author: maqingtao
 * @Description: LeetCode：3 Accept
 * @Date 2018/8/13
 */
public class P3 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabc");
    }
    public static void lengthOfLongestSubstring(String s) {
        List list = new LinkedList();
        char str[] = s.toCharArray();
        int maxLenth = 0;
        for (int i = 0; i < str.length; i++) {
            dealList(list, str[i]);
            list.add(str[i]);
            if (list.size() > maxLenth) {
                maxLenth = list.size();
            }
        }
        System.out.print(maxLenth);
    }

    public static void dealList(List list, char c) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(c)) {
                for (int j = 0; j <= i; j++) {
                    list.remove(0);
                }
            }
        }

    }

}
