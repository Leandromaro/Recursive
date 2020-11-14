package com.company.matrix;

public class Matrix {

    /*
        Problem:
        Given a matrix, show all of its numbers
     */

    public static void main(String[] args){

        int [][] m = {
                {1,3,5},
                {6,7,8},
                {2,2,4}};
        recursive(m, 0 , 0);
    }

    public static void recursive(int[][] matrix, int i, int j){
        if(i < matrix.length){
            if (j < matrix[i].length){
                System.out.println(matrix[i][j]);
                j++;
            }else {
                j=0;
                i++;
                System.out.println(" ");
            }
            recursive(matrix, i , j);
        }
    }
}
