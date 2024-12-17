/*
Experiment number : 20
Experiment name : Write a Java program to convert an array to an ArrayList.
 */

package Convert_an_array.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDemo18 {
    public static void main(String []args){
        // create an array of strings.
        String [] my_array = new String [] {"Python", "Java","C program", "C++ program","Dart"};

        //create an ArrayList of strings and initialize it with the contents of the array.
        ArrayList list = new ArrayList(Arrays.asList(my_array));

        //Print the arraylist to the console.
        System.out.println(list);
    }
}
