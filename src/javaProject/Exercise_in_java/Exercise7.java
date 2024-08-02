/*Write a java program that takes a number as input and prints
its multiplication table up to 10.
Test Date : input number is 8
8x1=8
8x2=16
8x3=24
......
8x10=80
*/

package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String [] arg){

        // Write a Java program to display the following pattern.
        //Sample Pattern
        System.out.println("     j     a   v       v  a ");
        System.out.println("     j    a a   v     v  a  a ");
        System.out.println(" j   j   aaaaaa   v  v  aaaaaa ");
        System.out.println("   jj   a      a    v  a      a ");

        //Scanner function
        Scanner scr = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Wel-come toh Multiplication");
        System.out .println("Enter the any number:");

        int num = scr.nextInt();


        for( int i=0; i <10; i++){
            System.out.println(num +"x"+(i+1)+"="+(num*(i+1)));
        }
        scr.close();
    }
}
