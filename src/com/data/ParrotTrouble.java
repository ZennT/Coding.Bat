package com.data;

/**
 * We have a loud talking parrot.
 * The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 */

public class ParrotTrouble {
    public static void main(String[] args) {
        parrotTrouble(true,7);

    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && 20 < hour || talking && hour < 7){

            //System.out.println("true");
                return true;
        }
        //System.out.println("false");
        return false;

    }
}
