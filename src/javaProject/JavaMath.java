package javaProject;

//Get whole and fractional parts from a double value
public class JavaMath {
    public static void main(String [] args){
        double value = 12.35;
        double fractional_part = value % 1;
        double integral_part =  value - fractional_part;

        System.out.println("\nOriginal value : "+value);
        System.out.println("\nIntegral part"+integral_part);
        System.out.println("\nFractional part" +fractional_part);
        System.out.println();
    }
}
