package com.devpro.code;
import java.lang.Math;

public class Binary {

    public static void main(String[] args) {

        String a="1011"; //3
        String b="1"; //1

         int num1=Integer.parseInt(a,2);

        System.out.println(num1);

         int num2=Integer.parseInt(b,2);;

        System.out.println(num2);

         int sum=num1+num2;

         System.out.println("*****"+Integer.toBinaryString(sum));


    }
}
