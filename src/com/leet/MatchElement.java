package com.leet;

import java.util.Arrays;
import java.util.List;
/*
Matching Elements in a stream
 */
public class MatchElement {

    public static void main(String[] args) {

        List<String> s= Arrays.asList("orange","blue","red","black","yellow");
        boolean o=s.stream().anyMatch(k->k.endsWith("j"));
        System.out.println("Array has words that endswith 'd'"+o);

        boolean j=s.stream().noneMatch(k->k.endsWith("j"));
        System.out.println("Array has words that endswith 'e'"+j);

        boolean m=s.stream().allMatch(k->k.length()>2);
        System.out.println("Array has words that endswith 'e'"+m);




    }

}
