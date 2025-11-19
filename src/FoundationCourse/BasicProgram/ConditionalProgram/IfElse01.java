package FoundationCourse.BasicProgram.ConditionalProgram;

import java.util.Scanner;

public class IfElse01 {
    public static void main (String Args []) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any number");

        int Button = scanner.nextInt();

        if (Button == 1) {
            System.out.println("Hello");
        } else if (Button == 2) {
            System.out.println("Hallo");
        } else if (Button == 3) {
            System.out.println("Nomaskar");
        } else {
            System.out.println("invalid button");
        }
    }
}
