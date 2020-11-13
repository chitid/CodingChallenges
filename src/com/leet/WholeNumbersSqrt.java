package com.leet;

public class WholeNumbersSqrt {


    public static void main(String[] args) {

        int wholeNumber=19;
        int notWholeNumber=16;

        wholeNumbersSqrt(wholeNumber);

    }

    public static void wholeNumbersSqrt(int n) {

        double d = Math.sqrt(Integer.valueOf(n).doubleValue());
        System.out.println("whole number is" + d+ " floor value is"+Math.floor(d));
    }


    }


