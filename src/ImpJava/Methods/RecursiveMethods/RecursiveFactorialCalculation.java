package ImpJava.Methods.RecursiveMethods;

public class RecursiveFactorialCalculation {
    //Write a Java recursive method to calculate the factorial of a given positive integer.
    public static int calculateFactorial (int n){
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case : multiply n with factorial of (n-1)
        return n * calculateFactorial(n -1);
    }

    public static void main (String [] agr){
        int number = 7;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + "is" + factorial);

        number = 12;
        factorial = calculateFactorial(number);
        System.out.println("\nFactorial of " + number + "is" + factorial);
    }
}
