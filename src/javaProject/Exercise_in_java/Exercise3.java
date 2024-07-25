// Write a java program to divide two number and point them on the screen.

package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        int result = (a / b);
        System.out.println("Show the result is: "+ result);

        scanner.close();
    }

}
