/*Create abstract class Shape which has instance variables side, area and perimeter and methods 
calculateArea(), calculatePerimeter() as abstract methods and display() as concrete method. 
Write subclasses which extend Shape class like Triangle, Rectangle, Circle, Cube and Squere 
and override abstract methods and display methods in subclass take instance variable if 
needed as per the formula. And use parameterized constructor to initialize instance variables 
using “this” reference variable. Write Test class and Create a reference variable of Shape which 
will hold the objects of all the sub classes and calculate respective area, perimeter and display 
the results.*/

abstract class Shape {
    double side, area, perimeter;
    
    //Parameterized constructor
    Shape(double side) {
        this.side = side;
    }

    //Abstract methods
    abstract void calculateArea();
    abstract void calculatePerimeter();

    //Concrete method
    void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

