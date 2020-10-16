package com.leet;

public class MoveZeroes {

    public static void main(String[] args) {
        int k[]=moveZeroesPointer(new int[]{6,0,7,0,8,5,0,9});
        for (int j:
             k) {
            System.out.println(j);
        }
    }
    // 6,0,7,0,8,9
    // 6,0,7,0,8,9
    public static int[] moveZeroesPointer(int nums[]) {
        int end=nums.length-1;
        for (int j= 0; j< nums.length - 1; j++) {
            int i=0;
            while(i<end){
               if(nums[i]==0) {
                   int temp = 0;
                   temp = nums[i + 1];
                   nums[i + 1] = nums[i];
                   nums[i] = temp;
               }
               i++;
            }

        }
       return nums;
    }
}
