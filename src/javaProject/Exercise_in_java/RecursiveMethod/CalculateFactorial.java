package javaProject.Exercise_in_java.RecursiveMethod;

public class CalculateFactorial {
    public static int calculate(int n){
        if (n==0){
            return 1;
        }
        return  n * calculate(n -1);
    }
    public static void main(String [] args){
        int number = 7;
        int factorial = calculate(number);
        System.out.println("Factorial of" + number+"is :" +factorial);
        number = 12;
        factorial = calculate(number);
        System.out.println("\n Factorial of " + number + "is:" + factorial);
    }
}
