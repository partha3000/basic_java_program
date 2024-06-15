package ImpJava.NewProject;

import java.util.Scanner;

public class electricityBill {

    public static double electricBill(int unit)
    {
        double FixedRate = 100;
        double Rate0_100 = 6.35;
        double Rate101_200 = 6.85;
        double RateMoreThan200 = 7.20;

        if (unit <= 100 ){
            return FixedRate + (unit * Rate0_100 );
        } else if (unit <= 200) {
            return FixedRate + (100 * Rate0_100)+ (unit-100)* Rate101_200;
        }else {
            return  FixedRate + (100 * Rate0_100) + (100 * Rate101_200) + (unit - 200) * RateMoreThan200;
        }
    }
    public static void main(String [] args){



        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the unit :");
        int unit = scanner.nextInt();

        double bill = electricBill(unit);
        System.out.println("bill amount is :" + bill);
        scanner.close();
    }
}
