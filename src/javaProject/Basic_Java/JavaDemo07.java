/*
Experiment number :22
Experiment Name: Write a java program to convent a binary number to a decimal number
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo07 {
    public static void main (String [] args){
        // Create a Scanner object to red input from user.
        Scanner scanner = new Scanner(System.in);

        //Declare variables to store binary and decimal number , remainder , and a multiplier
        long binaryNumber , decimalNumber = 0, j = 1, remainder;

        //Prompt the user to input a binary number
        System.out.println("Input a binary number :");
        binaryNumber = scanner.nextLong();

        //Convert the binary number to decimal
        while (binaryNumber !=0){
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j ;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        // Display the decimal representation of the binary number
        System.out.println("Decimal Number :" + decimalNumber);
    }
}
