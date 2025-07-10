package com.devpro.code;

import java.util.Arrays;
import java.util.Stack;

public class ValidParenthes{

    public static void main(String[] args) {

        String str="()[]{}{}";

        Stack<Character> stack=new Stack<>();

       char []chars= str.toCharArray();

       for(int i=0;i<chars.length;i++){
           if(chars[i]=='(' || chars[i]=='{' || chars[i]=='['){
               stack.push(chars[i]);
           }
           else if(chars[i]==')' || chars[i]=='}' || chars[i]==']'){
               if(stack.isEmpty())
                   return;
               else {
                   stack.pop();
               }
           }
       }

      if(stack.isEmpty()){
          System.out.println(true);
      } else {
          System.out.println(false);
      }


    }
}
