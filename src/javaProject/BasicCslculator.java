package javaProject;

import java.util.Scanner;

public class BasicCslculator {
    public static void main(String[] args) {
        double num1,num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.println("Enter the operator ((+,-,*,/):");

        char op = scanner.next().charAt(0);
        double o = 0;

        switch (op){
            case '+':
                o = num1 + num2;
                break;

            case '-':
                o =num1 - num2;
                break;

            case '*':
                o = num1 * num2;
                break;

            case '/':
                o = num1 / num2;
                break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("The final result:");

        System.out.println(num1 + " " + op + " " + num2
                + " = " + o);
    }
}
