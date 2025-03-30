/*
Experiment Name : Local variable or Global variable in java programming .
 */
package JavaBasicCode;

public class LGVariable {
    // Global variable declaration
    static int Global = 100;

    public static void exampleFunction(){
        int x = 20;
        int y = 30;
        int z = x + y + Global;
        System.out.println("The sum value is : " + z);
    }
    public static void main (String [] age){
        exampleFunction();
    }
}
