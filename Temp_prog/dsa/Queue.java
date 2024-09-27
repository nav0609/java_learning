/*\
 * Order 
 * ------
 * FIFO (First In First Out)
 * 
 * Operations
 * -----------
 * 
 * 1. enqueue()
 * 2. dequeue()
 * 
 * Other Functions
 * ----------------
 * 1. front()
 * 2. back()
 * 3. display()
 * 
 */

package dsa;

public class Queue {
    private final int cap;
    private final Object[] que;
    private int front;
    private int back;

    public Queue(int max) {
        cap = max;
        que = new Object[cap];
        front = -1;
        back = -1;
    }

    public void enqueue(Object obj) {
        if (back == cap - 1) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            que[back] = obj;
        } else {
            back++;
            que[back] = obj;
        }
    }

    public void dequeue() {
        if (front == -1 && back == -1) {
            System.out.println("Queue is empty!");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    public Object front() {
        if (front == -1 && back == -1) {
            throw new RuntimeException("Queue is empty!");
        } else {
            return que[front];
        }
    }

    public Object back() {
        if (front == -1 && back == -1) {
            throw new RuntimeException("Queue is empty!");
        } else {
            return que[back];
        }
    }

    public void display() {
        for (int i = front; i <= back; i++) {
            System.out.print("| "+que[i].toString()+" |" + "\t");
        }
    }
}