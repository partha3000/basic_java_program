package javaProject.Method;

import java.util.Scanner;

public class Experiment6 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer:");
        int digits = scanner.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }
    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
