/*
Experiment Number : 32
Experiment Name : Write a java program to compare two numbers
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo17 {
    public static void main (String [] Args){
        // Create a Scanner to obtain input from command windows
        Scanner scanner =  new Scanner(System.in);
        int number1; // First number to compare
        int number2; //Second number to compare

        // Prompt the user to input the first integer
        System.out.println("Input first integer:");
        number1  = scanner.nextInt();

        // Prompt the user to input the second integer
        System.out.println("Input second integer:");
        number2 = scanner.nextInt();

        // Compare and display the results
        if (number1 == number2){
            System.out.printf("%d == %d\n", number1, number2);
        }
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);

        scanner.close();
    }
}
