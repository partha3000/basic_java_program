package ImpJava.NewProject;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 0;
        boolean result = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        result = isLeapYear(year);

        if (result) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        scanner.close();
    }
}
