package Convert_an_array.Array;

public class ArrayDemo01 {
    public static void main(String [] args){

        //Declare an array
        int intArray[];

        //Initialize an array of 8 int
        // set aside memory of 8 int
        intArray =  new int[8];

        System.out.println("Array before adding data.");

        //Display elements of an array.
        display(intArray);

        //Operation : Insertion
        //Add elements in the array
        for(int i = 0; i < intArray.length; i++){
            //place value of i at index i.
            System.out.println("Adding"+i+ "at index"+i);
            intArray[i] = i;
        }
        System.out.println();

        System.out.println("Array after adding data.");
        display(intArray);

        int index = 5;
        intArray[index] = 10;

        System.out.println("Array after updating element at index" +index);
        display(intArray);

        System.out.println("Data at index" + index + ":" + intArray[index]);

        int value = 4;
        for(int i =0; i < intArray.length; i++)
        {
            if(intArray[i] == value){
                System.out.println(value + "Found at index" +i);
                break;
            }
        }
        System.out.println("Date at index " + index + ":" + intArray[index]);
    }
    private static void display(int [] intArray){
        System.out.println("Array : [");
        for(int i = 0; i < intArray.length; i++){
            System.out.println("" +intArray[i]);
        }
        System.out.println("]");
        System.out.println();
    }
}
