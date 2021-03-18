package com.data;

public class SumDouble {
    //Given two int values, return their sum.
    // Unless the two values are the same,
    // then return double their sum.

    public static void main(String[] args) {
        sumDouble(2,2);

    }
    public static int sumDouble(int a, int b) {
        // a + b = doubleSum
        // a + a = sum
        // b + b = sum

        //Store the sum in a local variable
        int sum = a + b;
        if(a != b)
        {
            System.out.println("sum");
            return sum;
        }
        else{
            System.out.println("sumDouble");
            return sum * 2;
        }

    }


}
