package com.devpro.code;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        String str = "MCMXCIIV";

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char []charArray = str.toCharArray();

        int number=0;
        int result=0;

        for (int i = 0; i < charArray.length; i++) {
           number= number+ map.get(charArray[i]);
            int next = (i + 1 < charArray.length) ? map.get(charArray[i + 1]) : 0;

            if (number < next) {
                result -= number;
            } else {
                result += number;
            }
        }
        System.out.println(result);

    }
}
