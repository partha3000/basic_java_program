package ImpJava.Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //Logical Operators in java program

        //&& operator
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // || operators
        System.out.println((5 > 3) || (8 > 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // ! operators
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false
    }
}
