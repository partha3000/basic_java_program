package FoundationCourse.BasicProgram.ConditionalProgram;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second Number:");
        double num2 = sc.nextDouble();

        System.out.println("+ - * / press any one operator");

        char op = sc.next().charAt(0);

        double result ;

        if (op == '+'){
            result = num1+num2;
            System.out.println("result:"+result);
        }
    }
}
