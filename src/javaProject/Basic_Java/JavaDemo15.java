/*
Experiment Number :30
Experiment Name : Java Convert a hexadecimal to octal number .
 */
package javaProject.Basic_Java;

import java.util.Locale;
import java.util.Scanner;

public class JavaDemo15 {
    public static int hex_to_oct(String s) {
        // Define a string containing hexadecimal digits.
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase(); // Convert the input string to uppercase
        int val = 0; //Initialize the decimal value to 0.

        // Iterate through each character in the input string.
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i); // Get the current character.
            int d = digits.indexOf(c); //Update the decimal value using hexadecimal
        }
        return  val ; // Return the decimal value
    }
    public static void main (String [] arg){
        String hexdec_num;
        int dec_num, i = 1 , j;
        int octal_num [] = new int [100];
        Scanner scanner = new Scanner (System.in);

        // Prompt the user to input a hexadecimal number.
        System.out.println("Input a hexadecimal number :");
        hexdec_num = scanner.nextLine();

        //Call the hec_to_oct function to convert the hexadecimal number to octal number.
        dec_num = hex_to_oct(hexdec_num);

        //Convert the decimal number to octal
        while (dec_num !=0){
            octal_num[i++] = dec_num % 8;
            dec_num = dec_num / 8;
        }

        // Display the equivalent octal number
        System.out.println("Equivalent of octal number is :");

        for(j =i - 1; j > 0; j++) {
            System.out.println(octal_num[j]);
        }

        System.out.println("\n");
        scanner.close();
    }
}
