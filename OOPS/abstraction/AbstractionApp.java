abstract class Plane {
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}
class CargoPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("CargoPlane tookOff..");
    }
    @Override
    public void fly() {
        System.out.println("CargoPlane flying..");
    }
    @Override
    public void land() {
        System.out.println("CargoPlane landing..");
    }
}
class PassengerPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("PassengerPlane tookOff..");
    }
    @Override
    public void fly() {
        System.out.println("PassengerPlane flying..");
    }
    @Override
    public void land() {
        System.out.println("PassengerPlane landing..");
    }
}
class FighterPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("FighterPlane tookOff..");
    }
    @Override
    public void fly() {
        System.out.println("FighterPlane flying..");
    }
    @Override
    public void land() {
        System.out.println("FighterPlane landing..");
    }
}
class Airport {
    public void allowPlane(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}
public class AbstractionApp {
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.allowPlane(new PassengerPlane());
        airport.allowPlane(new FighterPlane());
        airport.allowPlane(new CargoPlane());
    }
}