package ImpJava.NewProject;

import java.util.Scanner;

public class OddEven {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the any Even or Odd number :");

        int User1 = scanner.nextInt();

        if(User1 % 2 == 0){
            System.out.println("Enter the Evan number");
        }else {
            System.out.println("Enter the Odd number");
        }
        scanner.close();
    }
}


