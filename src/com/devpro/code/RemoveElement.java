package com.devpro.code;

import java.util.Arrays;

public class RemoveElement {


    public static void main(String[] args) {

        int [] arr = {1,2,3,3,4,5,6,10};
        int val=3;
        int test[]=removeElement(arr,val);

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

    }

    public static int[] removeElement(int[] nums, int val) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;

    }


}
