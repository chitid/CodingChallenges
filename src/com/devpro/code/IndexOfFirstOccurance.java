package com.devpro.code;

public class IndexOfFirstOccurance {

    public static void main(String[] args) {

        String haystack="codeleetcode";
        String needle="leet";
        int n;
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {

        int n;
        if(haystack.contains(needle))
        {
            n= haystack.indexOf(needle);
            return n;
        } else {
             return -1;
        }
    }
}
