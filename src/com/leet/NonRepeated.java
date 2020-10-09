package com.leet;
@FunctionalInterface
public interface NonRepeated {

    default void nonRepeated(){
        System.out.println(" in default method");
    }

     int nonRepeatedChar();

    static void nonRepeatedStatic(){
        System.out.println(" in static method");
    }
}

