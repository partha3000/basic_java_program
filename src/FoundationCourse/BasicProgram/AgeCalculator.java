package FoundationCourse.BasicProgram;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write you Birth Day :");

        System.out.println("Day (1-31)");
        int day = sc.nextInt();
        System.out.println("Month (1-12)");
        int month = sc.nextInt();
        System.out.println();
        int year = sc.nextInt();

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period age = Period.between(birthday, today);

        System.out.println("\n===== AGE CALCULATOR RESULT =====");
        System.out.println("You are " + age.getYears() + " years, "
                + age.getMonths() + " months, "
                + age.getDays() + " days old.");
    }
}
