package com.leet;

import java.util.HashMap;
import java.util.Map;

public class ReversingLetters {

    public static void main(String args[]) {

        String wordReverse="my name is devprod";
        StringBuilder s=new StringBuilder();

        char []k=wordReverse.toCharArray();
        Map<Character,Integer> gh=new HashMap<>();


        System.out.println(wordReverse.chars().filter(c->c=='d').count());


    }

}
