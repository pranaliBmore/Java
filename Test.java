/*Create abstract class Shape which has instance variables side, area and perimeter and methods 
calculateArea(), calculatePerimeter() as abstract methods and display() as concrete method. 
Write subclasses which extend Shape class like Triangle, Rectangle, Circle, Cube and Squere 
and override abstract methods and display methods in subclass take instance variable if 
needed as per the formula. And use parameterized constructor to initialize instance variables 
using this reference variable. Write Test class and Create a reference variable of Shape which 
will hold the objects of all the sub classes and calculate respective area, perimeter and display 
the results.*/

abstract class Shape {
    double side, area, perimeter;

    // Parameterized Constructor
    Shape(double side) {
        this.side = side;
    }

    // Abstract Methods
    abstract void calculateArea();
    abstract void calculatePerimeter();

    // Concrete Method
    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

// Subclass Triangle
class Triangle extends Shape {

    Triangle(double side) {
        super(side);
    }

    void calculateArea() {
        area = (Math.sqrt(3) / 4) * side * side;
    }

    void calculatePerimeter() {
        perimeter = 3 * side;
    }

    void display() {
        System.out.println("\n==================================");
        System.out.println("           TRIANGLE");
        System.out.println("==================================");
        System.out.println("Side = " + side);
        super.display();
        System.out.println("==================================");
    }
}

// Subclass Rectangle 
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        super(0); // Dummy value for side
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
        System.out.println("\n==================================");
        System.out.println("          RECTANGLE");
        System.out.println("==================================");
        System.out.println("Length = " + length);
        System.out.println("Width  = " + width);
        super.display();
        System.out.println("==================================");
    }
}

// Subclass Circle
class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    void calculateArea() {
        area = Math.PI * side * side;
    }

    void calculatePerimeter() {
        perimeter = 2 * Math.PI * side;
    }

    void display() {
        System.out.println("\n==================================");
        System.out.println("            CIRCLE");
        System.out.println("==================================");
        System.out.println("Radius = " + side);
        super.display();
        System.out.println("==================================");
    }
}

// Subclass Square
class Square extends Shape {

    Square(double side) {
        super(side);
    }

    void calculateArea() {
        area = side * side;
    }

    void calculatePerimeter() {
        perimeter = 4 * side;
    }

    void display() {
        System.out.println("\n==================================");
        System.out.println("            SQUARE");
        System.out.println("==================================");
        System.out.println("Side = " + side);
        super.display();
        System.out.println("==================================");
    }
}

// Subclass Cube
class Cube extends Shape {

    Cube(double side) {
        super(side);
    }

    void calculateArea() {
        area = 6 * side * side; // Surface Area
    }

    void calculatePerimeter() {
        perimeter = 12 * side; // Total Edge Length
    }

    void display() {
        System.out.println("\n==================================");
        System.out.println("             CUBE");
        System.out.println("==================================");
        System.out.println("Side = " + side);
        super.display();
        System.out.println("==================================");
    }
}

// Test Class
public class Test {
    public static void main(String[] args) {

        System.out.println("************************************************");
        System.out.println("      SHAPE AREA & PERIMETER CALCULATOR");
        System.out.println("************************************************");

        Shape s;

        s = new Triangle(5);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Rectangle(6, 4);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Circle(7);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Square(5);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Cube(3);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        System.out.println("\n************************************************");
        System.out.println("        PROGRAM EXECUTED SUCCESSFULLY");
        System.out.println("************************************************");
    }
}