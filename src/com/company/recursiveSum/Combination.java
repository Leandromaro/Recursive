package com.company.recursiveSum;

public class Combination {

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
