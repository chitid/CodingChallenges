package com.leet;

public class LengthofLastWord {

    public static void main(String[] args) {
        // TODO Auto-generated method stub\
        String s = " ";
        int k = lengthOfLastWord(s);
        System.out.println("Length of last word" + k);

    }

    // TODO Auto-generated method stub
    private static int lengthOfLastWord(String s) {/*String wL[] = s.split(" ");
        int size = wL.length;
        String k = wL[size - 1];
        return k.length();*/
        if(s.length()==0)
            return 0;
        else if(s.equalsIgnoreCase(" "))
        {
            return 0;
        }else if(s.length()==1){
            return 1;
        }else {
            int k = s.lastIndexOf(" ");
            return (s.substring(k).length()) - 1;
        }
    }

}
