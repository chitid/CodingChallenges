package com.leet;

import com.leet.sch.Subjects;
//import com.devpro.sch.sub;

import java.util.*;

public class ArraysMain {

    public static void main(String args[]) {
        List<Subjects> sub = new ArrayList<Subjects>();
        sub.add(new Subjects(1, "maths"));
        sub.add(new Subjects(2, "social"));
        sub.add(new Subjects(3, "science"));
        sub.add(new Subjects(4, "english"));
        sub.add(new Subjects(5, "art"));
        sub.add(new Subjects(6, "music"));


        sub.stream()
                .filter(subjects -> subjects.getSubjectName().equals("music"))
                .forEach(subjects -> System.out.println(subjects.getSubjectId()));


        Map<Integer,String> d=new HashMap<>();


    }


}
