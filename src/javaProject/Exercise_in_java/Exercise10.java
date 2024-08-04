/*
Write a java program to print the area and perimeter of a circle
test date: 03-08-2024
 => Radius = 7.5
 */

package javaProject.Exercise_in_java;

import java.util.Scanner;

public class Exercise10 {

//    private static final double radius = 7.5;

    public static void main (String [] arg){
//
//        System.out.println("Circle Perimeter and Area");
//
//        double perimeter = 2* Math.PI * radius;
//
//        double area = Math.PI * radius * radius;
//
//        System.out.println("Perimeter is = "+perimeter);
//        System.out.println("Area is =" + area);


        //using for scanner function

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inter the radius of the circle :");

        double radius = scanner.nextDouble();

        System.out.println("Perimeter is ="+(2 * radius *Math.PI));
        System.out.println("Area is = "+ (Math.PI * radius * radius));

        scanner.close();
    }
}
