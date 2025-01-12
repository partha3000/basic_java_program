/*
Experiment number : 20
Experiment Name :Write a Java program to convert a decimal number to a hexadecimal number.
 */

package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo05 {
    public static void main(String [] args){
        int dec_number, rem;

        String hexdec_number = "";

        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a decimal number:");
        dec_number = scanner.nextInt();

        while (dec_number > 0) {
            rem = dec_number % 16;
            hexdec_number = hex[rem] + hexdec_number;
            dec_number = dec_number /16;
        }
        System.out.println("Hexadecimal number is :" + hexdec_number + "\n");
        scanner.close();
    }
}
