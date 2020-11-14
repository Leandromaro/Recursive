package com.company.arrays;

public class Arrays {

    /*
        Problem:
        move thought an array showing all the values
     */

    public static void main(String[] args){
        int[] array = {1,-2,4,8,-3,11};
        showRecursiveArray(array, 0);
    }

    public static void showRecursiveArray(int[] array, int position){

        if(position == array.length - 1){
            System.out.println(array[position]);
        }else {
            System.out.println(array[position]);
            showRecursiveArray(array, position + 1);
        }
    }
}
