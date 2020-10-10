package com.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        List<FruitBasket> fruitBasketList = Arrays.asList(new FruitBasket("Gac", 2000),
                new FruitBasket("Hemi", 1600), new FruitBasket("Gac", 3000),
                new FruitBasket("Apollo", 2000), new FruitBasket("Horned", 1700));

        fruitBasketList.stream()
                .map(FruitBasket::getType)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


    }


}
