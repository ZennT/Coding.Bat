package com.data;

public class MonkeyTrouble {

    public static void main(String[] args) {
        monkeyTrouble(true,true);
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if(aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
