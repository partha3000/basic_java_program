/*
Write a java program that takes three number as input to calculate
and print the average of the number

Test Date:04-08-2024

 */

package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise11_1 {
    public static void main(String [] args){
        double n = 0;
        double x = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number (n) you want to calculate the average");
        int num = scanner.nextInt();

        while ((x <= num)){
            System.out.println("input number" + " ( " + (int) x + " ) " + " : ");
            num += scanner.nextInt();
            x+=1;
        }

        double avgn = (n/num);

        System.out.println("Average: "+ +avgn);

        scanner.close();
    }
}
