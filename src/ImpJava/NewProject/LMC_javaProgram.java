package ImpJava.NewProject;

import java.util.Scanner;

public class LMC_javaProgram {
    //LMC(lowest common multiple) number
    private static long findLCM(int number1, int number2){

        long MinMultiple = 0;

        int smallest = (number1 < number2) ? number1 : number2;
        int largest = (number1 > number2) ? number1 : number2;

        MinMultiple = smallest;

        while (true){
            if(MinMultiple % largest == 0)
                return MinMultiple;
            MinMultiple = MinMultiple + largest;
        }
    }
    public static void main(String[] arg){
        int num1 = 0;
        int num2 = 0;
        long lcm = 0;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter the integer number ::");

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        lcm = findLCM(num1, num2);

        System.out.println("LCM(" + num1
                + "," + num2 + ") = " + lcm );
        scanner.close();

    }
}
