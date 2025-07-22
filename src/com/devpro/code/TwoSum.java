package com.devpro.code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        System.out.println(" Two sum indices");
        int []nums=new int[]{2,9,11,15,8,5,5,7};
        int target=9;
        int []twoSomeIndices= twoSum2(nums,target);
        for(int i=0;i<twoSomeIndices.length;i++)
        System.out.println(twoSomeIndices[i]);
    }


    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int k= target-nums[i];
            if(map.containsKey(k)){
                return new int[]{map.get(k),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
