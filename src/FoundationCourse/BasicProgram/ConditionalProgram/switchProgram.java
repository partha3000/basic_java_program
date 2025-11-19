package FoundationCourse.BasicProgram.ConditionalProgram;

import java.util.Scanner;

public class switchProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press any Button");

        int button = scanner.nextInt();

        switch (button){
            case 1:
                System.out.println("Button 1");
            case 2:
                System.out.println("button 2");
            case 3:
                System.out.println("Button 3");
            case 4:
                System.out.println("Button 4");
            default:
                System.out.println("Invalid Button Press");
        }


    }
}
