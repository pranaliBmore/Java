/*Create Vehicle Interface with name, maxPassanger, and maxSpeed variables. Create
LandVehicle and SeaVehicleinteface from Vehicle interface. LandVehicle has numWheels
variable and drive method. SeaVehicle has displacement variable and launch method. Create
Car class from LandVehicle, HoverCraft from LandVehicle and SeaVehicle interface. Also create
Ship from SeaVehicle. Provide additional methods in HoverCraft as enterLand and enterSea.
Similarly provide other methods for class Car and Ship. Demonstrate all classes in a application.*/

interface Vehicle {
    String name = "Default Vehicle";
    int maxPassanger = 4;
    int maxSpeed = 120;
}
interface LandVehicle extends Vehicle {
    int numWheels = 4;
    void drive();
}

interface SeaVehicle extends Vehicle {
    int displacement = 500;
    void launch();
}
class Car implements LandVehicle {

    public void drive() {
        System.out.println("Car is driving");
    }

    public void park() {
        System.out.println("Car is parked");
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Max Passenger: " + maxPassanger);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Number of Wheels: " + numWheels);
    }
}
class HoverCraft implements LandVehicle, SeaVehicle {

    public void drive() {
        System.out.println("HoverCraft is driving on land");
    }

    public void launch() {
        System.out.println("HoverCraft is launching on water");
    }

    public void enterLand() {
        System.out.println("HoverCraft is entering land");
    }

    public void enterSea() {
        System.out.println("HoverCraft is entering sea");
    }

    public void displayInfo() {
        System.out.println("HoverCraft Name: " + name);
        System.out.println("Max Passenger: " + maxPassanger);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Displacement: " + displacement);
    }
}

class Ship implements SeaVehicle {

    public void launch() {
        System.out.println("Ship is launching on water");
    }

    public void sail() {
        System.out.println("Ship is sailing");
    }

    public void displayInfo() {
        System.out.println("Ship Name: " + name);
        System.out.println("Max Passenger: " + maxPassanger);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Displacement: " + displacement);
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Car c = new Car();
        c.displayInfo();
        c.drive();
        c.park();
        System.out.println();

        HoverCraft h = new HoverCraft();
        h.displayInfo();
        h.drive();
        h.launch();
        h.enterLand();
        h.enterSea();
        System.out.println();

        Ship s = new Ship();
        s.displayInfo();
        s.launch();
        s.sail();
           
    }
}





