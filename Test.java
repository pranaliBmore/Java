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

// Subclass Triangle
class Triangle extends Shape {
    Triangle(double side) {
        super(side);
    }
    void calculateArea() {
        area = (Math.sqrt(3) / 4) * side * side; // Math.sqrt(3) is used to calculate the area of an equilateral triangle
    }
    void calculatePerimeter() {
        perimeter = 3 * side;
    }

    void display() {
        System.out.println("\nTriangle");
        super.display();
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width)
    {
        super(0); 
        this.length = length;
        this.width = width;
    }
    void calculateArea() {
        area = length * width;
    }

    void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    void display() {
        System.out.println("\nRectangle");
        super.display();
    }
}

