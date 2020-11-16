package com.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int []nums =new int[]{5,7,2,3,3};
        int k=6;
        int h[]=twoSum(nums,k);
        for (int o:h){
            System.out.println(o);
        }
    }

    private static int[] twoSum(int[] nums, int k) {

       // Arrays.sort(nums);

        /*for(int i=0;i<nums.length-1;i++){

            if(nums[i]+nums[i+1]==k)
                return new int[]{i,i+1};
        }*/

       /* for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++){
                  int tmp=k-nums[i];
                if(nums[j]==tmp)
                    return new int[]{i,j};

        }*/

        Map<Integer,Integer> ms=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
              int compl=k-nums[i];
              if(ms.containsKey(compl)){
                 return new int[]{ms.get(compl),i};
              }
           ms.put(nums[i],i);

            }
        throw new IllegalArgumentException("no match found");
    }

}
