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

// Double Stack
class DoubleStack implements Stack {
    double[] stack;
    int top = -1;

    DoubleStack(int size) {
        stack = new double[size];
    }

    public void push(String value) {
        if (overflow()) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = Double.parseDouble(value);
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

// Main Class
public class Stack_Interface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Stack Size: ");
        int size = sc.nextInt();

        System.out.println("\nSelect Stack Type");
        System.out.println("1. Integer Stack");
        System.out.println("2. String Stack");
        System.out.println("3. Double Stack");
        System.out.print("Enter your choice: ");

        int type = sc.nextInt();

        Stack stack = null;

        switch (type) {
            case 1:
                stack = new IntegerStack(size);
                break;

            case 2:
                stack = new StringStack(size);
                break;

            case 3:
                stack = new DoubleStack(size);
                break;

            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }

        int choice;

        do {
            System.out.println("\n========== STACK MENU ==========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Check Overflow");
            System.out.println("5. Check Underflow");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    String value = sc.next();
                    stack.push(value);
                    break;

                case 2:
                    System.out.println("Popped Element: " + stack.pop());
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    if (stack.overflow())
                        System.out.println("Stack is Full.");
                    else
                        System.out.println("Stack is Not Full.");
                    break;

                case 5:
                    if (stack.underflow())
                        System.out.println("Stack is Empty.");
                    else
                        System.out.println("Stack is Not Empty.");
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

    }
}