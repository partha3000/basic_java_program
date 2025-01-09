/*
Experiment Number : 19
(Decimal to binary)
Experiment Name: write a java program to converter an integer number to a binary number
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo04 {
    public static void main (String [] args){
        // Declare variables to store decimal number , quotient , and an array for binary digits.
        int dec_number , quot, i =1, j;
        int bin_number [] = new int [100];


        //Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to input a decimal number
        System.out.println("Input a Decimal number :");
        dec_number = scanner.nextInt();

        //Initialize the quotient with the decimal number
        quot = dec_number;

        //Convert the quotient with the decimal number
        while (quot != 0 ){
            bin_number[i++] = quot % 2;
            quot = quot /2;
        }
        //Display the binary representation of the decimal number
        System.out.println("Binary number is : ");
        for (j = i - 1; j > 0; j--){
            System.out.println(bin_number[j]);
        }
        System.out.println("\n");
        scanner.close();
    }
}
