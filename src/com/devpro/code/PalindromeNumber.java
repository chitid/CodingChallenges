package com.devpro.code;

public class PalindromeNumber {


    public static void main(String[] args) {

        int num=131;
        int reverseNum=0;
        int remainder=0;

       while (num !=0){
           remainder = num%10;
           reverseNum = reverseNum*10+remainder;
           num=num/10;
       }

       if(num==reverseNum){
           System.out.println("Palindrome");
       }



    }


}
