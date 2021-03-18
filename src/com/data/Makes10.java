package com.data;

/**
 * Given 2 ints, a and b,
 * return true if one if them is 10 or if their sum is 10.
 */

public class Makes10 {

    public static void main(String[] args) {
        makes10(10,9);
    }

    public static boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a + b == 10){
            return true;
        }
        return false;



    }
}
