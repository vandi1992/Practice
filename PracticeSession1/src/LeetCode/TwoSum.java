package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {16, 4, 23, 8, 15, 42, 1, 2};
        int target = 19;
        HashMap<Integer,Integer> newTable =  new HashMap<>();

        for (int i=0;i<a.length;i++){
            if(newTable.containsKey(target-a[i])){
                System.out.println(newTable.get(target-a[i])+","+i);
            }
            newTable.put(a[i],i);
        }



        //int[] a2 = a.clone();


        //O(n)=Onlogn
        /*
        //int[] a = {2,15,11,7};
        ArrayList<Integer> al = new ArrayList<>();
        int target = 19;
        Arrays.sort(a);
      //  int[] a = Arrays.stream(aa).sorted().toArray();
        int left = 0;
        int right =a.length-1;
        while(left<right){
            if(a[left]+a[right] > target){
                right--;
            }
            else if(a[left]+a[right] < target){
                left++;
            }
            else if(a[left]+a[right] == target){
                al.add(Arrays.asList(a2).indexOf(a[left]));
                al.add(Arrays.asList(a2).indexOf(a[right]));
               // al.add(right);
                System.out.println(al);
                break;
            }
            else{
                System.out.println("Not found");
                break;
            }
        }
    }

         */
    }
}
