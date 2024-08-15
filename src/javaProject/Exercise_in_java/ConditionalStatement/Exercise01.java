/*
Write a java program to geta a  number from the user and print
whether it is positive or negative
@ Test Date:07-08-2024
input number
 */


package javaProject.Exercise_in_java.ConditionalStatement;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the any number:");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("Enter the number is positive");
        }else if(number < 0){
            System.out.println("Enter the number is negative");
        }else{
            System.out.println("Enter the number is zero");
        }
scanner.close();

    }
}
