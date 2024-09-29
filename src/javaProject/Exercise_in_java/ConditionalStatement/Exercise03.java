package javaProject.Exercise_in_java.ConditionalStatement;

public class Exercise03 {
    public static void main(String [] arg){

            {
                Scanner in = new Scanner(System.in);
                System.out.print("Input the first number: ");
                double x = in.nextDouble();
                System.out.print("Input the second number: ");
                double y = in.nextDouble();
                System.out.print("Input the third number: ");
                double z = in.nextDouble();
                System.out.print("The average value is " + average(x, y, z)+"\n" );
            }

            public static double average(double x, double y, double z)
            {
                return (x + y + z) / 3;
            }
        }
}
