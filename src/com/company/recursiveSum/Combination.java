package com.company.recursiveSum;

public class Combination {

    /*
        Problem:
        Given a number, sum all the the numbers up to it
        and return the value
     */

    public static void main(String[] args){
        System.out.println(recursiveSum(9));
    }

    public static int recursiveSum(int number){
        if(number==1){
            return 1;
        }
        return number + recursiveSum(number - 1);
    }
}
