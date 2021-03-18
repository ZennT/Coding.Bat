package com.data;

/**
 * We have two monkeys, a and b,
 * and the parameters aSmile and bSmile
 * indicate if each is smiling.
 * We are in trouble if they are both smiling or
 * if neither of them is smiling. Return true if we are in trouble.
 */
public class MonkeyTrouble {

    public static void main(String[] args) {

        monkeyTrouble(true,true);
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        if(aSmile && bSmile || !aSmile && !bSmile){
            System.out.println("true");
            return true;
        }
            return false;
    }
}
