package com.recursive.backtracking;

import java.util.ArrayList;

public class UpToNumberCombinations {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> combinations = new ArrayList<>();
        upToNumberCombinations(10, numbers, 0, combinations, 0);
    }

    public static void upToNumberCombinations(int number, int[] numbers, int sum, ArrayList<Integer> combinations, int pos) {
        if (sum == number) {
            System.out.println(combinations.toString());
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (pos < numbers.length) {
                    // ADD
                    combinations.add(numbers[pos]);
                    sum = sum + numbers[pos];
                    //RECURSIVE
                    upToNumberCombinations(number, numbers, sum, combinations, pos + 1);
                    // ERASE
                    sum = sum - numbers[pos];
                    combinations.remove(combinations.lastIndexOf(numbers[pos]));

                    pos++;
                }else {
                    break;
                }
            }
        }
    }
}
