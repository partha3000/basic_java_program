// Solve Quadratic Equation
package ImpJava.Statements.IfElse;

import java.util.Scanner;

public class ifElse_program3 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a:");
        double a = scanner.nextDouble();

        System.out.println("Input b:");
        double b = scanner.nextDouble();

        System.out.println("Input c:");
        double c = scanner.nextDouble();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + "and" +r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }else {
            System.out.println("the equation has no real roots.");
        }
    }
}
