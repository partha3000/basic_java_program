/*
experiment name : Write a Java program to add two matrices of the same size
 */


package Convert_an_array.Array;

import java.util.Scanner;

public class ArrayDemo17 {
    public static void main(String [] Args){
     int m, n, c, d;

     //Create a new Scanner object to read user input
        Scanner in = new Scanner(System.in);

        //Prompt the user to input the number of columns for the matrix.
        System.out.println("Input number of rows of the matrix");
        m = in.nextInt();

        //Prompt the user to input the number of columns for the matrix.
        System.out.println("Input number of columns of the matrix");
        n = in.nextInt();

        //create two-dimensional array to store matrix date.
        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum [][] = new int[m][n];

        //Prompt the user to input elements of the first matrix.
        System.out.println("input elements of the first matrix");
        for (c = 0; c < m; c++){
            for (d = 0; d < n; d++) {
                array1[c][d] = in.nextInt();
            }
        }
        //Prompt the user to input element of the second matrix.
        System.out.println("Input elements of the second matrix");
        for (c = 0; c < m; c++){
            for (d = 0; d < n; d++){
                array2[c][d] = in.nextInt();
            }
        }
        //calculate the sum of the sum of the matrices.
        for (c = 0; c < m; c++){
            for(d = 0; d < n; d++){
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }
        //Display the result , which is the sum od the matrices.
        System.out.println("sum of the matrices:");
        for (c = 0; c < m; c++){
            for (d =0; d < n; d++){
                System.out.println(sum[c][d]+"\t");
            }
            System.out.println();
        }
    }
}
