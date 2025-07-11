package com.devpro.code;

import java.util.Stack;

public class LongestValidParenthes {

    static int maxbalancedprefix(String str, int n) {
        int sum = 0;
        int max_length = 0;
        int open_count = 0;

        // Traversing the string.
        for (int i = 0; i < n; i++) {

            // If open bracket, increment open_count.
            if (str.charAt(i) == '(') {
                sum += 1;
                open_count++;
            }
            // If closed bracket, decrement sum.
            else {
                sum -= 1;
                if (open_count > 0) {
                    open_count--;
                    max_length
                            = i + 1; // Update max_length to
                    // current index if valid
                    // prefix found.
                } else {
                    break; // Break if closed bracket
                    // encountered before open
                    // bracket.
                }
            }
        }

        return max_length;
    }

    // Driven Program
    public static void main(String[] args) {
        String str = "((()())()(";
        int n = str.length();

        System.out.println(
                maxbalancedprefix(str, n)); // Output: 10
    }

}