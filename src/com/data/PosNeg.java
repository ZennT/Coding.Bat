package com.data;

/**
 * Given 2 int values,
 * return true if one is negative and one is positive.
 * Except if the parameter "negative" is true,
 * then return true only if both are negative.
 */

public class PosNeg {

    public static void main(String[] args) {
        posNeg(3,9, true);

    }
    public static boolean posNeg(int a, int b, boolean negative) {
        // int1
        //int2
        // true --> int1 + int2-
        //          int1 - int2 +
        //true --> int 1 && int2  -

        if(negative){
            if(a < 0 && b < 0){
                return true;
            }return false;
        }if(a < 0 && b > 0 || a > 0 && b < 0){
            return true;
        }return false;



    }



}
