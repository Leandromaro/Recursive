package com.recursive.backtracking;

import java.util.ArrayList;

public class CombinationsSum {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> numbers = new ArrayList<>();
        combinationsSum(4, numbers,0);
    }

    public static void combinationsSum(int number, ArrayList<Integer> numbers, int sum){
        if(sum == number){ // Base Case
            System.out.println(numbers);
        }else { // Recursive Case
            for (int i = 1; i<=number; i++){
                sum += i;
                if (sum <= number){
                    numbers.add(i);
                    combinationsSum(number,numbers,sum);
                    numbers.remove(numbers.indexOf(i));
                }
                sum -= i;
            }
        }
    }
}
