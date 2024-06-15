package ImpJava.NewProject;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {
        //int user1 ,user2;
        //System.out.println("Enter the two number");


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the two number :");

            //String user1 = scanner1.nextLine();
            //System.out.println("User Name 1:" +scanner1);

            //Scanner scanner2 = new Scanner(System.in);
            //System.out.println("Enter the 2nd number ");

            int user1 =scanner.nextInt();
            int user2 =scanner.nextInt();

            //String user2 = scanner2.nextLine();
            //System.out.println("User Name 2:" +scanner2);

        System.out.println("Enter the used a operator (+,-,*,/)");
            char operator = scanner.next().charAt(0);
            solve(user1, user2, operator);

    }
    public static int solve(int user1, int user2, char operator ) {
        int result = 0;
        if (operator == '+') {
            result = user1 + user2;
            System.out.println("Enter the Addition : " + result);
        }
        else if(operator == '-'){
            result = user1 - user2;
            System.out.println("Enter the Subtraction : " + result);
        } else if (operator == '*'){
            result = user1 * user2;
            System.out.println("Enter the Multiplication : " +result);
        }
        else if (operator == '/') {
            result = user1 / user2;
            System.out.println("Enter the Division : " + result);
        }
        System.out.println("your result:");
        return result;
    }
}
