package com.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

/*
Sum,Max,Min
 */
public class MaxMinSum {


    public static void main(String[] args) {
        List<FruitBasket> allFruits = Arrays.asList(new FruitBasket("Oranges", 5),
                new FruitBasket("apples", 10), new FruitBasket("berries", 1),
        new FruitBasket("bananas", 9)
                );

        OptionalInt v=allFruits.stream().mapToInt(FruitBasket::getWeight).min();
        OptionalInt k=allFruits.stream().mapToInt(FruitBasket::getWeight).max();
        int o=allFruits.stream().mapToInt(FruitBasket::getWeight).sum();
        System.out.println("Max ,min, sum ="+v.getAsInt()+", "+k.getAsInt()+" ,"+o);
    }
}


