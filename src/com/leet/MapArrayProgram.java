package com.leet;

import java.util.HashMap;
import java.util.Map;

/*

 */
public class MapArrayProgram {

    public static void main(String[] args) {

        Map<Integer,String> ghk=new HashMap<>();

        for(int i=1;i<10;i++) {
            ghk.compute(i, (k, v) -> k <5 ? "one" : "two");
        }

        ghk.entrySet().stream()
                .filter(en->en.getValue().equals("two"))
                .forEach(e->System.out.println("key value is "+e.getKey()+" value of the entry"+e.getValue()));
        
    }


}
