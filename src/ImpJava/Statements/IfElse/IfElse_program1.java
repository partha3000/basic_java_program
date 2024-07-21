package ImpJava.Statements.IfElse;

import java.util.Scanner;

public class IfElse_program1 {
    public static void main(String [] args){
        int day = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any 1-7 number:");

        day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("SaturDay");
                break;
            case 2:
                System.out.println("SunDay");
                break;
            case 3:
                System.out.println("MonDay");
                break;
            case 4:
                System.out.println("TuesDay");
                break;
            case 5:
                System.out.println("WednesDay");
                break;
            case 6:
                System.out.println("ThursDay");
                break;
            case 7:
                System.out.println("FriDay");
                break;
        }

    }
}
