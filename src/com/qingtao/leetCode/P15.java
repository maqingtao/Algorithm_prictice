package com.qingtao.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @Author: maqingtao
 * @Description: 三数之和(双向指针)
 * @Date 2018/8/30
 */
public class P15 {
    public static void main(String[] args) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        threeSum(num);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else {
                int start = i+1, end = nums.length - 1;
                int target = 0 - nums[i];
                while (start < end) {
                    List<Integer> a = new ArrayList<>();
                    if (nums[start] + nums[end] == target) {
                        a.add(nums[i]);
                        a.add(nums[start]);
                        a.add(nums[end]);
                        list.add(a);
                        while (start < end && nums[start] == nums[start + 1]) {
                            start++;
                        }
                        while (start < end && nums[end] == nums[end - 1]) {
                            end--;
                        }
                        start++;
                        end--;
                    } else if (nums[start] + nums[end] > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return list;
    }
}
