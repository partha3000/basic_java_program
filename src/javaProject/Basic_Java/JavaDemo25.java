/*
Experiment Name : Write a java program to list available character sets in charset.
Experiment Number : 40
 */
package javaProject.Basic_Java;

import java.nio.charset.Charset;

public class JavaDemo25 {
    public static void main (String [] args){
        System.out.println("List of available character sets: ");

        // Iterate through the available character sets and print their names
        for(String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
