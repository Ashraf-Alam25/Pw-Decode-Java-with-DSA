class Plane {
    public void takeOff() {
        System.out.println("Plane tookOff...");
    }
    public void fly() {
        System.out.println("Plane is flying...");
    }
    public void land() {
        System.out.println("Plane is landing...");
    }
}
class PassengerPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("Passenger-Plane tookOff...");
    }
    @Override
    public void fly() {
        System.out.println("Passenger-Plane is flying...");
    }
    @Override
    public void land() {
        System.out.println("Passenger-Plane is landing...");
    }
}
class CargoPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("Cargo-Plane tookOff...");
    }
    @Override
    public void fly() {
        System.out.println("Cargo-Plane is flying...");
    }
    @Override
    public void land() {
        System.out.println("Cargo-Plane is landing...");
    }
}
class FighterPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("Fighter-Plane tookOff...");
    }
    @Override
    public void fly() {
        System.out.println("Fighter-Plane is flying...");
    }
    @Override
    public void land() {
        System.out.println("Fighter-Plane is landing...");
    }
}
class Airport {
    public void allowPlane(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}
public class PlaneApp {
    public static void main(String[] args) {
        PassengerPlane passenger = new PassengerPlane();
        CargoPlane cargo = new CargoPlane();
        FighterPlane fighter = new FighterPlane();

        Airport airport = new Airport();

        airport.allowPlane(passenger);
        airport.allowPlane(cargo);
        airport.allowPlane(fighter);
    }
}
