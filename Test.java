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
        System.out.println("\nCircle");
        super.display();
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
        System.out.println("\nSquare");
        super.display();
    }
}

// Subclass cube 
class Cube extends Shape {
    Cube(double side) {
        super(side);
    }
    void calculateArea() {
        area = 6 * side * side;
    }

    void calculatePerimeter() {
        perimeter = 12 * side;
    }

    void display() {
        System.out.println("\nCube");
        super.display();
    }
}

// Test class
class Test {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle(5);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Rectangle(3,6);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Circle(6);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Square(5);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

        s = new Cube(3)
        s.calculateArea();
        s.calculatePerimeter();
        s.display();

    }
}