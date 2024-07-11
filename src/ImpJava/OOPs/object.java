//Create a java program class and object

package ImpJava.OOPs;

//class name is (object)
public class object {

    int x = 10; //attribute1
    int y = 20; //attribute2
    int z = 30; //attribute3
    public static void main(String[] args){
        object myObj1 = new object(); // create an object
        object myObj2 = new object(); // create an object
        object myObj3 = new object(); // create an object

        //display the object or attribute result
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        System.out.println(myObj3.z);
    }
}
