/*
Write a java program that takes three number as input to calculate
and print the average of the number

Test Date:04-08-2024

 */


package javaProject.Exercise_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String [] args){

        System.out.println("Enter the five numbers");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1st number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the 3rd number :");
        int num3 = scanner.nextInt();
        System.out.println("Enter the 4th number :");
        int num4 = scanner.nextInt();
        System.out.println("Enter the 5th number :");
        int num5 = scanner.nextInt();

         int result = (num1+num2+num3+num4+num5)/5;

         System.out.println("Enter the average numbers is:"+result);


    }
}
