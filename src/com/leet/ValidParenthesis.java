package com.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis<psvm> {


    public static void main(String[] args) {
        String o="(){}[](){}[";
        System.out.println( "parenthesis valid is"+isValid(o));
    }

    public static boolean isValid(String s){
       Map<Character,Character> d=new HashMap<>();
       d.put('(',')');
       d.put('{','}');
       d.put('[',']');
       /* if(s.length()%2!=0)
            return false;*/
        char []g=s.toCharArray();
        for (char r:g) {
            char f = d.get(r);


        }

        return false;
    }
}
