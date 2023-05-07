package com.devpro.code;



public class PlusOne {

    public static void main(String[] args) {

        int digits[]=plusOne(new int[]{1,9,9});
         for(int i=0;i<digits.length;i++){
             System.out.println(digits[i]);
         }
    }

    public static int[] plusOne(int []digits){
        for (int i=digits.length-1;i>=0;i--){
  //9-->
            if(digits[i]<9){
                digits[i]+=1;
                return digits;
            }
                digits[i]=0;
        }
        return digits;
    }


}
