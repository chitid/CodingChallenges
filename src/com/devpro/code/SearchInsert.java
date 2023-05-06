package com.devpro.code;


import java.util.Arrays;

public class SearchInsert {

    public static void main(String[] args) {

        int nums[] = new int[]{1, 3, 5, 6,7};
        int target = 4;
        int index = 0;

        int arr[] = new int[nums.length+1];
        int j=0;
        for (int i = 1; i <= nums.length; i++) {
            arr[i] = nums[i-1];
        }
        arr[j] = target;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        System.out.println(index);

    }

}
