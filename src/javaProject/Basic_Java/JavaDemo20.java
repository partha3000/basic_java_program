/*
Experiment Number : 35
Experiment Name : Write a java program to compute the area of a polygon
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo20 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of sides on the polygon:");

        //read the number od side from the user.
        int ns = scanner.nextInt();

        //Prompt the user to input the length of one of the side.
        System.out.println("Input the length of one of the side: ");

        //Read the length of one side from the user.
        double side = scanner.nextDouble();

        // Calculate and display the area of the polygon
        System.out.println("The area is : " + polygonArea (ns, side) + "\n");
        scanner.close();
    }
    public static double polygonArea (int ns, double side){
        return  (ns * (side * side)) / (4.0 * Math.tan((Math.PI/ns)));
    }
}
