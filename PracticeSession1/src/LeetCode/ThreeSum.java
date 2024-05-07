package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


//https://leetcode.com/problems/3sum/description/
public class ThreeSum {
    public static void main(String[] args) {
        int[] a = {0,0,0};
        //int target = 19;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> newTable = new HashMap<>();
        System.out.println(threeSum(a));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> nhash = new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int total = nums[i]+nums[left]+nums[right];
                if(total>0){
                    right--;
                }
                else if(total<0){
                    left++;
                }
                else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    while(nums[left]==nums[left-1]&&left<right)
                        left++;
                }
            }
        }
        /*
        for(int i=1;i<nums.length-1;i++){
            int target = nums[i-1]==0?0:-(nums[i-1]);
            if(nhash.containsKey(target-nums[i])){
                ans.add(Arrays.asList(nums[i-1],nums[i],target-nums[i]));
            }
            nhash.put(nums[i-1],i-1);
            nhash.put(nums[i],i);

        }
        */
        return ans;
    }
}
