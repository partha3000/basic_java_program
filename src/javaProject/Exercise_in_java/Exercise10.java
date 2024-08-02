/*
Write a java program to print the area and perimeter of a circle
test date: 03-08-2024
 => Radius = 7.5
 */

package javaProject.Exercise_in_java;

public class Exercise10 {

    private static final double radius = 7.5;

    public static void main (String [] arg){

        System.out.println("Circle Perimeter and Area");

        double perimeter = 2* Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is =" + area);
    }
}
