package com.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByLengthString {

    public static void main(String[] args) {

        String []diffString=new String[]{"practicing","code","problems","for","the","day"};
        String []sortStringss=Arrays.stream(diffString)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        for (String stringss : sortStringss) {
            System.out.println(stringss);
        }
        String dg=Arrays.stream( new String[]{"My","Second","approachesss","Problems"})
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining("|"));
        System.out.println(dg);


    }

}
