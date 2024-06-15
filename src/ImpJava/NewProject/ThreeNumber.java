package ImpJava.NewProject;

import java.util.Scanner;

public class ThreeNumber {
    public static double threeNumber(double num1, double num2, double num3)
    {
        if (num1 >= num2){
            if(num1 >= num3)
                return num1;
            else return num3;
        } else {
            if (num2 >= num3) return num2;
            else return num3;
        }
    }

    public static void main(String [] args)
    {
        double num1, num2, num3;
        double LargestNumber = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three numbers:");

        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        LargestNumber = threeNumber(num1, num2, num3);

        System.out.println("The Largest Numer is :" + LargestNumber);

        scanner. close();
    }
}
