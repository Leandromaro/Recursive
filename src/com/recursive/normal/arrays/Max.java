package com.recursive.normal.arrays;

public class Max {

    /*
        Problem:
        find the max value
     */

    public static void main(String[] args){
        int[] array = {1,-2,4,8,-3,11};
        System.out.println(maxValue(array, array[0], 0));
    }

    public static int maxValue(int[] array, int max, int index){
        if (index != array.length) {
            if(array[index] > max){
                max = maxValue(array, array[index], index + 1);
            }else {
                max = maxValue(array, max, index + 1);
            }
        }
        return max;
    }
}
