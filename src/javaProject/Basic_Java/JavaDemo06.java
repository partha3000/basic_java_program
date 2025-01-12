/*
Experiment number : 21
Experiment name : write a java program to covert a decimal number to an octal number.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo06 {
    public static void main (String [] args){

        int dec_number , rem , quot, i= 1, j;
        int oct_number [] = new int [100];

        //Create a Scanner object to read input from the user
        Scanner scanner =  new Scanner(System.in);

        //Prompt the user to input a decimal number
        System.out.println("Input a Decimal Number :");
        dec_number = scanner.nextInt();

        //Initialize the quotient with the decimal number
        quot = dec_number;

        //Convert the decimal number to octal and store octal digits
        while (quot != 0){
            oct_number[i++] = quot % 8;
            quot = quot / 8;
        }

        //Display the octal representation of the decimal number
        System.out.println("Octal number is :");
        for (j = i - 1; j > 0; j --){
            System.out.println("oct_number[j]");
        }
        System.out.println("\n");
        scanner.close();
    }
}
