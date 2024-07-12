package com.devpro.code;

public class PalindromeString {

    public static void main(String[] args) {
        String str="level";
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){

            reverse=reverse+str.charAt(i);
        }

        if(reverse.equalsIgnoreCase(str)){
            System.out.println("Palindrome");
        }
    }
}
