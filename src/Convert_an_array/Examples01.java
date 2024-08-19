/*
###---Convert an array to linked list---###
problem Statement : Given an array arr[] of size N. The task is to create a linked list
form the given array and return the head of the linked list
 */

package Convert_an_array;
class Node {                                          //we are calling a class Node
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class Examples01 {                                             // main class
    private static Node convertarr2LL(int [] arr){                    //object
       Node head = new Node(arr[0]);
       Node mover = head;
       for (int i=1; i<arr.length; i++){                              //  Conditionals
           Node temp = new Node(arr[i]);
           mover.next=temp;
           mover=mover.next;
       }
       return head;
    }
    public static void main(String [] args){                                //main method
        int [] arr = {2,5,8,7};  //array list
        Node head = convertarr2LL(arr);
        System.out.println(head.data);                                     //show the display
    }
}
