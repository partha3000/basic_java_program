package FoundationCourse.BasicProgram.ConditionalProgram;

/*
Make a Calculator. Take 2 numbers (a & b) from the user and an
operation as follows :
1 : + (Addition) a + b
● 2 : - (Subtraction) a - b
● 3 : * (Multiplication) a * b
● 4 : / (Division) a / b
● 5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and
display it to the user.
*/

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        //User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Passe any One : + - * / % ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+'){
            result = num1 + num2;
            System.out.println("Result:" +result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result:"  +result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result:" +result);
        } else if (op == '/') {
            if (num2 != 0){
                result = num1 / num2;
                System.out.println("Result:" +result);
            } else {
                System.out.println("Error: Division");
            }
        } else if (op == '%') {
            if (num2 != 0){
                result = num1 % num2;
                System.out.println("Result:" + result);
            }else {
                System.out.println("Error: module");
            }
        }else {
            System.out.println("Invalid OP");
        }
        sc.close();
    }
}
