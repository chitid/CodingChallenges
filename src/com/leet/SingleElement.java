package com.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleElement {

    public static void main(String[] args) {
        int []a=new int[]{3,4,2,2,3,4,1,7,1,9,7};
        System.out.println("sinle numbet is"+singleNumber(a));
    }
    public static int singleNumber(int nums[]){
        Map<Integer,Integer> j=new HashMap<>();

        for (int i :nums) {
            j.put(i,j.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(j.get(i)==1) {
                return i;
            }
        }
        return 0;
        }
    }





