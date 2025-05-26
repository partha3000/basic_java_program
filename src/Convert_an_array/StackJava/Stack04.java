//Java: Reverse the elements of a stack

package Convert_an_array.StackJava;

import java.util.Stack;

public class Stack04 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public void Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int poppedElement = arr[top];
            top--;
            return poppedElement;
        }
    }

    // Method to get the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public void reverse() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        int[] reversedArray = new int[arr.length];
        int index = 0;

        while (!isEmpty()) {
            int temp = pop();
            reversedArray[index++] = temp;
        }

        for (int i = 0; i < index; i++) {
            push(reversedArray[i]);
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // If either of the numbers is zero, return 1 as a special case
        if (x == 0 || y == 0) {
            return 1;
        }

        // If x is less than y, swap the values using a temporary variable
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }

        // Check if x is divisible by y
        if (x % y == 0) {
            return y; // Return y if it evenly divides x
        } else {
            return euclid(y, x % y); // Recursively call the euclid method with y and the remainder of x/y
        }
    }

    public static void main(String[] args) {
        // Displaying the result of the Euclidean algorithm for specific pairs of numbers
        System.out.println("result: " + euclid(48, 24));
        System.out.println("result: " + euclid(125463, 9658));
    }
    }

}
