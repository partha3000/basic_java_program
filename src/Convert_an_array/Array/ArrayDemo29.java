/*
Experiment Name : Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.
Pictorial Presentation
Experiment Number : 31
 */

package Convert_an_array.Array;

import java.util.Arrays;

public class ArrayDemo29 {
    // The main method for executing the program.
    public static void main(String[] args) {
        // Declare and initialize an array of integers.
        int[] array_nums = {10, 77, 10, 54, -11, 10};

        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Define the search number and the fixed sum.
        int search_num = 10;
        int fixed_sum = 30;

        // Call the result method with the array, search number, and fixed sum as arguments and print the result.
        System.out.println("Result: " + result(array_nums, search_num, fixed_sum));
    }

    // Define a method named result that takes an array of integers, a search number, and a fixed sum as inputs.
    public static boolean result(int[] numbers, int search_num, int fixed_sum) {
        // Initialize a temporary sum.
        int temp_sum = 0;

        // Use an enhanced for loop to iterate through the array elements.
        for (int number : numbers) {
            // Check if the current number is equal to the search number.
            if (number == search_num) {
                // Add the search number to the temporary sum.
                temp_sum += search_num;
            }

            // Check if the temporary sum exceeds the fixed sum.
            if (temp_sum > fixed_sum) {
                // If the sum exceeds the fixed sum, exit the loop.
                break;
            }
        }

        // Check if the temporary sum is equal to the fixed sum and return the result.
        return temp_sum == fixed_sum;
    }
}
