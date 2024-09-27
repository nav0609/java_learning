/*

Order
------
LIFO (Last In First Out)

Operations
-----------
1. push()
2. pop()

Other Functions
----------------
1. top()
2. bottom()
3. display()

*/
package dsa;

public class Stack {
    private final int cap;
    private final Object[] arr;
    private int top;

    public Stack(int max) {
        cap = max;
        arr = new Object[cap];
        top = -1;
    }

    public void push(Object obj) {
        if (top == cap - 1) {
            throw new StackOverflowError("Stack is full!");
        } else {
            arr[++top] = obj;
        }
    }

    public Object pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty!");
        } else {
            return arr[top--];
        }
    }

    public Object top() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty!");
        } else {
            return arr[top];
        }
    }

    public Object bottom() {
        if (top == -1) {
            throw new RuntimeException("Stack is Empty!");
        } else {
            return arr[0];
        }
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|\t" + arr[i].toString() + "\t|");
        }
    }
}
