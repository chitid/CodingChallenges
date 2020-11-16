package com.leet;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
int[] i=new int[]{9,9,9};
       int []p= plusOne(i);
for(int j:p)
        System.out.println(j);
    }

    private static int[] plusOne(int[] i) {

        for(int k=i.length-1;k>=0;k--){
            if(i[k]<9){
                i[k]++;
                return i;
            }
            i[k]=0;
        }
        int []new_num=new int[i.length+1];
        new_num[0]=1;
        return new_num;


    }
}
