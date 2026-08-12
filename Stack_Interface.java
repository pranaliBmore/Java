/*Create the interface stack which has variable size, abstract methods push (), pop (), display (), 
overflow () and underflow (). We need to implement 3 subclasses IntegerStack, StringStack and 
Double Stack respectively by implementing interface. All the methods in interface are declared 
for string. And in subclass for integer Stack convert string to integer. Same thing to all other. 
Create one test class and check for the working of all the classes. */
import java.util.Scanner;
// Interface
interface Stack {
    void push(String value);
    String pop();
    void display();
    boolean overflow();
    boolean underflow();
}

// Integer Stack
class IntegerStack implements Stack {
    int[] stack;
    int top = -1;

    IntegerStack(int size) {
        stack = new int[size];
    }

    public void push(String value) {
        if (overflow()) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = Integer.parseInt(value);
            System.out.println(value + " inserted successfully.");
        }
    }

    public String pop() {
        if (underflow()) {
            return "Stack Underflow!";
        }
        return String.valueOf(stack[top--]);
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.print("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == stack.length - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

// String Stack
class StringStack implements Stack {
    String[] stack;
    int top = -1;

    StringStack(int size) {
        stack = new String[size];
    }

    public void push(String value) {
        if (overflow()) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
            System.out.println(value + " inserted successfully.");
        }
    }

    public String pop() {
        if (underflow()) {
            return "Stack Underflow!";
        }
        return stack[top--];
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.print("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean overflow() {
        return top == stack.length - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}


