/*
Experiment Number :33
Experiment Name : Write a java program and computer sum of an integer's digits.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo18 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to input an integer
        System.out.println("Input an integer: ");

        // Read the integer from the user.
        long n = scanner.nextLong();

        // Calculate and display the sum of the digits.
        System.out.println("The sum of the digits is : " + sumDigits(n));
    }
    public static int sumDigits(long n){
        int sum = 0;

        //Calculate the sum of the digits.
        while (n != 0){
            sum += (int) (n % 10);
            n /= 10;
        }
        return sum;
    }
}
