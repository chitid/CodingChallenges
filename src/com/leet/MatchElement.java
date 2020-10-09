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

    }

}
