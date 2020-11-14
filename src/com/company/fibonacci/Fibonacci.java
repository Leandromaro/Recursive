package com.company.fibonacci;

public class Fibonacci {

    /*
        Problem:
        Given a position, return the fibonnaci value at that position
     */

    public static void main(String[] args){
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int number){
        if(number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
