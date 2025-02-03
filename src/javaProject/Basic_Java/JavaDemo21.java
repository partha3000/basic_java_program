/*
Experiment Number : 36
Experiment Name :Write a java program to compute the distance between two points on the earth's surface.
 */
package javaProject.Basic_Java;

import java.util.Scanner;

public class JavaDemo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the latitude and longitude of coordinate 1
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = scanner.nextDouble();

        // Prompt the user to input the latitude and longitude of coordinate 2
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = scanner.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = scanner.nextDouble();

        // Calculate and display the distance between the two coordinates
        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
    }

    // Points will be converted to radians before calculation
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        // Convert latitude and longitude to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Earth's mean radius in kilometers
        double earthRadius = 6371.01;

        // Calculate the distance using the haversine formula
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }

}
