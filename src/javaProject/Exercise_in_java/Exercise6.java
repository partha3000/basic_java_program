/* Write a java program to print the sum(addition),multiply,
subtract, divide and remainder of two number

#Test Date:31-07-2024
input first number:125
input second number:24

Expected 125+24=
125-24=
125x24=
125/24=
125mod24=
* */


package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println(num1 +"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+ "x"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        System.out.println(num1+"mod"+num2+"="+(num1%num2));

        scanner.close();
    }
}
