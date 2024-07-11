package ImpJava.NewProject;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class object {
    int X = 5; // Attributes 1
    int Y = 3;

    // Set the value Z to 40
    int Z =12;


    public static void main (String [] arg){

        int number = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any number :");

        number = scanner.nextInt();

        //Object adding a main class
        object myObj = new object(); //object create 1
        object myObj2 = new object(); //object create 2
        object myObj3 = new object(); // object create 3
        myObj3.Z = 15; // value of object Z

        //display the object
        System.out.println(myObj.X);
        System.out.println(myObj2.Y);
        System.out.println(myObj3.Z);
        System.out.println("your number is :"+ number);
        scanner.close();

    }
}
