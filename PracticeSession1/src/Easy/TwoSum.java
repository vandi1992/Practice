package Easy;/*
Question:
Leetcode:https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 */

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] Sol = new int[2];
        for(int i=0; i<nums.length;i++)
            for(int j = i+1; j<nums.length;j++)
                if(target - nums[i] == nums[j])
                {
                    Sol[0] = i;
                    Sol[1] = j;
                }
        return Sol;
    }

    public static void main(String args[]){
        int[] a = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }
}
