/*
Experiment number : 23
Experiment Name :
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo08 {
    public static  void main (String [] args){
        int [] hex =  new int [1000];
        int i = 1, j = 0, rem , dec = 0, bin;

        // create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a binary number
        System.out.println("input a binary number :");
        bin = sc.nextInt();

        //Convert the binary number to decimal
        while (bin > 0){
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        i = 0;

        // Convert the decimal number to hexadecimal
        while (dec != 0){
            hex[i] = dec % 16;
            dec = dec / 16;
            i++;
        }
        // Display the hexadecimal values
        System.out.println("Hexadecimal value :");
        for (j = i - 1; j >= 0; j--){
            if (hex[j] > 9){
                System.out.println((char) (hex[j] + 55));
            }else{
                System.out.println(hex[j]);
            }
        }
        System.out.println("\n");
        sc.close();
    }
}
