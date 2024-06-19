package ImpJava.NewProject;

import java.util.Scanner;

public class MultiplicationJavaProgram {

    public static void
    printMultiplicationTable(int number){
        for(int i= 1; i<=10; i++)
            System.out.println(number+
                    " * " +i+ "=" + number * i);
    }

    public static void main(String[] args) {
        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer number ::");
        number = scanner.nextInt();

        System.out.println("Multiplication" + " table of " +number+ "is ::");
        printMultiplicationTable(number);

        scanner.close();
    }
}
