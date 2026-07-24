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

