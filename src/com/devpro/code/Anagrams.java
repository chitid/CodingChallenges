package com.devpro.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static void main(String[] args) {

        List<String> listofAnagrams=new ArrayList<>();
        listofAnagrams.add("listen");
        listofAnagrams.add("silent");
        listofAnagrams.add("vile");
        listofAnagrams.add("evil");
        listofAnagrams.add("done");

        String angram=new String("listen");
        String anagram2=new String("silent");

        char [] chars=anagram2.toCharArray();
        char []char1=angram.toCharArray();
        boolean flag =false;
        Arrays.sort(chars);
        Arrays.sort(char1);

        flag=Arrays.equals(chars,char1);
        System.out.println("******* Anagram *******: "+flag);

    }
}
