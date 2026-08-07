/*Create the interface stack which has variable size, abstract methods push (), pop (), display (), 
overflow () and underflow (). We need to implement 3 subclasses IntegerStack, StringStack and 
Double Stack respectively by implementing interface. All the methods in interface are declared 
for string. And in subclass for integer Stack convert string to integer. Same thing to all other. 
Create one test class and check for the working of all the classes. */


interface Stack
{
    int size = 5;

    void push(String value);
    void pop();
    void display();
    void overflow();
    void underflow();
}



