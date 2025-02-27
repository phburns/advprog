abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starting... Vroom!");
    }
    
    void stopEngine() {
        System.out.println("Car engine stopping... *quiet*");
    }
}

class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine starting... Brap brap!");
    }
    
    void stopEngine() {
        System.out.println("Motorcycle engine stopping... *silence*");
    }
}

public class Engine {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        System.out.println("Testing Car:");
        car.startEngine();
        car.stopEngine();
        
        System.out.println("\nTesting Motorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}