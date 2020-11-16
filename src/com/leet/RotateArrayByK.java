package com.leet;

public class RotateArrayByK {

    public static void main(String[] args) {

        int []i =new int[]{1,2,3,4,5,6,7};
        int k=3;
        int m[]=rotateArray(i,k);
        for (int p:
             m) {
            System.out.println(p);
        }
    }
    private static int [] rotateArray(int[] i, int k) {

        //k=i%k;
        System.out.println("hbbm"+ i.length%k);
        for(int j=i.length-k;j<i.length;j++){
            for(int l=k;l>=0;l--){
               int temp=0;
                temp=i[j];
                i[j]=i[l];
                i[l]=temp;
            }
        }
       return i;
    }
}
