/*
Experiment Number : 39
Experiment Name : Write a java program to create and display a unique three-digit number using 1,2,3,4. also count how many three-digit number are three.
 */
package javaProject.Basic_Java;

public class JavaDemo24 {
    public static void main (String arg []){
        int amount = 0; // Initialize a counter for three-digit  numbers

        // Iterate through three nested loops to generate all unique three number.
        for(int i =1; i <=4; i++){
            for(int j =1; j<=4; j++){
                for(int k =1; k<=4; k++){
                    // Check if 'i','j','k' are all different.
                    if (k !=i && k !=j && i != j){
                        amount++; // Increment the counter
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        //Display the total number of generate three-digit number
        System.out.println("Total number of the three-digit-number is " + amount);
    }
}
