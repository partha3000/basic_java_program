//Write a java program that takes two number as input and display the product of two number

/*Test Date:07-30-2024
Input first number:25
input second number:5*/


package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String args[]){

        //one time solution
//        int firstNumber = 25;
//        int secondNumber = 5;
//        int result = (firstNumber*secondNumber);
//        System.out.print("Enter the two number is:"+result);

        //two time solution
        //Using the scanner class
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println(number1 +"x" +number2 +"="+ number1*number2);
        //display function in java program
        scanner.close(); //close the scanner
    }
}
