/*
Experiment Number : 28
Experiment Name : Write a java program to convert a hexadecimal value into a decimal number.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo13 {
    public static int hex_to_decimal(String s){
        // Define a string containing hexadecimal digits.
        String digits = "0123456789ABCDEF";
        s = digits.toUpperCase(); // convert the input string to uppercase
        int val = 0; //Initialize the decimal value to 0

        //Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i); // Get the current character
            int d = digits.indexOf(c); // Find the index of the character in the digits string.
            val = 16 * val + d; //Update the decimal value using hex_decimal conversion.
        }
        return val;
    }
    public static void main(String [] args){
        String hexdec_num;
        int dec_num ;

        Scanner scanner = new Scanner(System.in);

        //Prompt the user to input a hexadecimal number
        System.out.println("Input a hexadecimal number :");
        hexdec_num = scanner.nextLine();

        // call the hex to decimal function to convert the hexadecimal number to decimal number .
        dec_num = hex_to_decimal(hexdec_num);

        //Display the equivalent decimal number
        System.out.println("Equivalent decimal number is :" + dec_num + "\n");

        scanner.close();
    }
}
