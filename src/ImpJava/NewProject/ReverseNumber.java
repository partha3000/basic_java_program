package ImpJava.NewProject;

import java.util.Scanner;

public class ReverseNumber {
    public static int findReverse(int num) {

        int reverse = 0;

        while(num != 0) {
            reverse = (reverse*10) + (num % 10);

            // remove last digit
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        int number = 0;
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number:: ");
        number = scanner.nextInt();

        result = findReverse(number);

        System.out.print("The reverse of "+number+
                " is = "+ result);

        // close Scanner class object
        scanner.close();
    }
}
