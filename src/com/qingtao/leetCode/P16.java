package com.qingtao.leetCode;

import java.util.Arrays;

public class P16 {
    public static void main(String[] args) {
        int num[] = {1,2,4,8,16,32,64,128};
        threeSumClosest(num,82);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int min = Math.abs(result - target);
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int temp = Math.abs(sum - target);
                if (temp < min) {
                     min=temp;
                    result = sum;
                } else if (sum>target) {
                        end--;
                }else {
                    start++;
                }
            }
        }
        return result;
    }

}
