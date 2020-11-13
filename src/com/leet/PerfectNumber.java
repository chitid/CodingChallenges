package com.leet;

import java.util.Scanner;

public class PerfectNumber {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int k=2;
        System.out.println(perfectNumber(k));
    }

    public static boolean perfectNumber(int num){
       int sum=0;
        for(int i=1;i<num;i++)
        {
            if( num%i == 0){
                sum=sum+i;
            }
        }
        return sum==num?true:false;
    }
}
