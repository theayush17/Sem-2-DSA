import java.util.*;

public class StackUsingArray {
    private int[] array;
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = value;
        System.out.println("Pushed " + value + " into the stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Top element: " + stack.peek());
    }
}
