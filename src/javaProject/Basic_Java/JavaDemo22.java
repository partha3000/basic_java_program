/*
Experiment Number : 37
Experiment Name :  Write a java program to reverse a string.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo22 {
    public static void main (String [] arg){
        // Create a scanner to obtain input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a strings.
        System.out.println("Input a string:");

        // Read the input strings and convert it to a character array.
        char [] letters = scanner.nextLine().toCharArray();

        // Display a massage before printing the reversed strings.
        System.out.println("Reverse string: ");

        // Iterate through the character array in reverse oder and print each character.
        for (int i = letters.length - 1; i >= 0; i--){
            System.out.println(letters[i]);
        }

        // Print a newline character to end the output line
        System.out.println("\n");
        scanner.close();
    }
}
