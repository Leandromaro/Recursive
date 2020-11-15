package com.recursive.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class Combinations {

    /*
        Problem:
        find the max value
     */

    public static void main(String[] args) {
        int[] array = {1, -2, 9, 21, 7, 6, 5, 6, 7, 7, 8};
        LinkedList integers = Arrays.stream(array).boxed().collect(Collectors.toCollection(LinkedList::new));
        findValueToSearchCombination(integers, 0, 5, new LinkedList<>(), 0);
    }

    public static void findValueToSearchCombination(List<Integer> integers,
                                                    int sum,
                                                    int valueToSearch,
                                                    LinkedList<Integer> comb,
                                                    int index) {

        if (sum == valueToSearch) {
            System.out.println(comb);
        } else {
            for (int i = index; i < integers.size(); i++) {
                Integer value = integers.get(i);
                // Add
                sum = sum + value;
                // Recursive
                if (sum <= valueToSearch && !comb.contains(value)) {
                    comb.add(value);
                    findValueToSearchCombination(integers, sum, valueToSearch, comb, (index + 1));
                    comb.remove(value);
                }
                // Remove
                sum = sum - value;
            }
        }
    }
}
