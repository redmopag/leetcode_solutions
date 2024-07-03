package redmopag.leetcode.solutions;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 */
public class RunningSumOf1dArray {
    // Space complexity = O(1)
    // Time complexity = O(n)
    public static int[] runningSum(int[] nums){
        for(int i = 1; i < nums.length; ++i){
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        System.out.println("Input: " + Arrays.toString(input));

        System.out.println("Output: " + Arrays.toString(runningSum(input)));
    }
}
