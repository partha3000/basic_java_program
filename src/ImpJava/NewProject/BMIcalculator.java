package ImpJava.NewProject;

import java.util.Scanner;

public class BMIcalculator {
    public  static String bmicalculator (double weight, double height) {
        double bmi = weight / (height + height);
        if (bmi < 18.5) {
            return "Thinness";
        } else if (bmi <25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        }else
        {
            return "obese";
        }
    }
    public static void main(String[]args){
        double weight = 0.0f;
        double height = 0.0f;

        String result = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight:");
        weight = scanner.nextDouble();

        System.out.println("Enter height:");
        height = scanner.nextDouble();

        result = bmicalculator( weight, height);

        System.out.println(result);

        scanner.close();

    }
}
