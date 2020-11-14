package com.company.arrays;

public class Search {

    /*
        Problem:
        move thought an array find a value,
        it returns the value position if exists and -1 if not
     */

    public static void main(String[] args){
        int[] array = {1,-2,4,8,-3,11};
        System.out.println(findValuePosition(array, -33, 0));
    }

    public static int findValuePosition(int[] array, int value, int index){
        if (index < array.length) {
            if(array[index]==value){
                return index;
            }else {
                return findValuePosition(array, value, index +1);
            }
        }
        return -1;
    }
}
