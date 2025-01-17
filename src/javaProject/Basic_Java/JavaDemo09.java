/*
Experiment Number :24
Experiment Name:Write a Java program to convert a binary number to an octal number.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo09 {
    public static void main (String [] args){
        // Declare variables to store binary and decimal number
        int bin_num, bin_num2,rem, dec_num = 0, quot, i = 1, j;
        int oct_num [] = new int [100];

        //Create a Scanner object to red input from the user.
        Scanner scan = new Scanner(System.in);

        //Prompt the user to input a binary number
        bin_num = scan.nextInt();
        bin_num2 = bin_num;

        // Convert the binary number to decimal
        while (bin_num > 0) {
            rem = bin_num % 10;
            dec_num = dec_num + rem * i;
            i = i * 2;
            bin_num = bin_num / 10;
        }
        i = 1;
        quot = dec_num;

        // Convert the decimal number  to octal
        while (quot > 0){
            oct_num[i++] = quot % 8;
            quot = quot / 8;
        }
        //Display the equivalent octal value of the original binary number .
        System.out.println("Equivalent octal value of " + bin_num2 + "is :");
        for (j = i -1; j > 0; j--){
            System.out.println(oct_num[j]);
        }
        System.out.println("\n");
    }
}
