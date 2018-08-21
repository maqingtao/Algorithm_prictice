package com.qingtao.leetCode;

/**
 * @Author: maqingtao
 * @Description: LeetCode 5
 * @Date 2018/8/13
 */
public class P5 {
    public static void main(String[] args) {
        System.out.print(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";
        int start = 0, end = 0;
        for (int i = 0; i < n - 1; i++) {
          int len1=deal(s,i,i);
          int len2=deal(s,i,i+1);
          int maxLen=Math.max(len1,len2);
          if (maxLen>end-start)
          {
              start=i-(maxLen-1)/2;
              end=i+maxLen/2;
          }
        }
        return s.substring(start,end+1);
    }
    public static int deal(String s, int l, int r) {
        int n = s.length();
        int left=l,right=r;
        while (left>= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
