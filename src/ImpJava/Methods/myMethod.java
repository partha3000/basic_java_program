package ImpJava.Methods;

public class myMethod {
    static void myMethod(String Name, int age){
        //System.out.println(Name); // just one value
        System.out.print(Name  + " is " +age +"" + " " ); // name age
    }
    public static void main(String [] args){
        myMethod("Rohan",21 );
        myMethod("jit",22);
        myMethod(" Rahul",22);
        myMethod("Sandipon", 23);
    }
}
