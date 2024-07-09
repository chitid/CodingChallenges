package com.devpro.code;

import java.util.ArrayList;
import java.util.List;

public class LongestPalidrome {


    public static void main(String[] args) {

        String s
                = "My name is ava and i love Geeksforgeeks";
       // boolean s1=isPalidrome("Geeksforgeeks");
        //System.out.println(s1);
        largestPalin(s);
    }

    private static void largestPalin(String s) {
        String[] s1 = s.split("\\W+");
        List<String> list = new ArrayList<>();
        for (String s2 : s1) {
            if (isPalidrome(s2))
                list.add(s2);
        }
        String largestPalidrome = list.stream().max((a, b) -> Integer.compare(a.length(), b.length())).orElse(null);
        System.out.println("**********"+largestPalidrome);
    }

    private static boolean isPalidrome(String s2) {
        StringBuilder sb = new StringBuilder(s2);
        String sb1 = sb.reverse().toString();
        System.out.println(sb1);
        return sb1.equalsIgnoreCase(s2);
    }
}
