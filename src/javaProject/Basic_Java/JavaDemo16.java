/*
Experiment Number : 31
Experiment Name : Write a java program to check whether java is installed on your computer.
 */
package javaProject.Basic_Java;

public class JavaDemo16 {
    public static void main ( String [] arg){
        //Display Java version.
        System.out.println("Java version :" + System.getProperty("Java.version"));

        //Display java runtime version.
        System.out.println("Java Runtime version :" + System.getProperty("java.runtime.version"));

        //Display java home directory.
        System.out.println("Java home :" + System.getProperty("java.home"));

        //Display java vendor name.
        System.out.println("Java Vendor :" + System.getProperty("java.vendor"));

        //Display java vendor URL.
        System.out.println("Java vendor URL :" + System.getProperty("java.vendor.Url"));

        //Display java class path.
        System.out.println("Java class path : " + System.getProperty("java.class.path"));
    }
}
