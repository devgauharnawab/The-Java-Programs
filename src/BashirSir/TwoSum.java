package BashirSir;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /*
            Given an array of integers, return indices of the two numbers such that
                they add up to a specific target.
            You may assume that each input would have exactly one solution,
                and you may not use the same element twice.
         */
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   sum[0] = i;
                    sum[1] = j;
                  /*  j = nums.length;
                    i = nums.length;*/
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] sum = twoSum(nums, target);
        for (int i:sum
        ) {
            System.out.print(i + " ");
        }
    }
}
