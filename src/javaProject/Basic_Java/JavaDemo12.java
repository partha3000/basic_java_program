/*
Experiment Number : 27
Experiment Name : Write a Java program to convert an octal number to a hexadecimal number.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo12 {
    public static void main(String args[]) {
        // Declare variables to store octal number and its decimal and hexadecimal equivalents
        String octal_num, hex_num;
        int decnum;

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input an octal number
        System.out.print("Input an octal number : ");
        octal_num = in.nextLine();

        // Convert the octal number to its decimal equivalent using parseInt
        decnum = Integer.parseInt(octal_num, 8);

        // Convert the decimal number to its hexadecimal equivalent
        hex_num = Integer.toHexString(decnum);

        // Display the equivalent hexadecimal number
        System.out.print("Equivalent hexadecimal number: " + hex_num + "\n");
    }
}
