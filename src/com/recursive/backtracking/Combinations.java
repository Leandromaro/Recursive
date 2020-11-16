package com.recursive.backtracking;

import java.util.*;
import java.util.stream.Collectors;

public class Combinations {

    /*
        Problem:
        find the values that combined sums the given number
     */

    public static void main(String[] args) {
        int[] array = {9, 2, -5, -7, -4,11,33,21};
        LinkedList integers = Arrays.stream(array).boxed().collect(Collectors.toCollection(LinkedList::new));
        findValueToSearchCombination(integers, 0, 9, new LinkedList<>(), 0);
    }

    public static void findValueToSearchCombination(List<Integer> integers,
                                                    int sum,
                                                    int valueToSearch,
                                                    LinkedList<Integer> comb,
                                                    int index) {

        List<Integer> noDuplicates = new ArrayList<>(new HashSet<>(integers));

        if (sum == valueToSearch) {
            System.out.println(comb);
        } else {
            for (int i = index; i < noDuplicates.size(); i++) {
                Integer value = noDuplicates.get(i);
                // Add
                sum = sum + value;
                // Recursive
                if (!comb.contains(value)) {
                    comb.add(value);
                    findValueToSearchCombination(noDuplicates, sum, valueToSearch, comb, (index + 1));
                    comb.remove(value);
                }
                // Remove
                sum = sum - value;
            }
        }
    }
}
