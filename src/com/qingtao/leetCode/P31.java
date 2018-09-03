package com.qingtao.leetCode;

import java.util.Arrays;
/**
 * @Author: maqingtao
 * @Description: 求下一个序列
 * @Date 2018/8/31
 */
public class P31 {
    public static void main(String[] args) {
        int num[] = {3,2,1};
        nextPermutation(num);
        System.out.println("");
    }

      public static void nextPermutation(int[] nums) {
        boolean flag = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j =nums.length - 1;j >i; j--) {
                if (nums[i] < nums[j]) {
                    int a;
                    a = nums[i];
                    nums[i] = nums[j];
                    nums[j] = a;
                    Arrays.sort(nums, i+1, nums.length);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if (!flag) {
            Arrays.sort(nums, 0, nums.length);
        }
    }

}
