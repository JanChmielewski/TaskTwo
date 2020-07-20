public class Main {
    public static void main(String[] args) {

//        Vehicle veh = new Vehicle();
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        System.out.println("Car speed is: " + car.carSpeed() + " km/h");
        System.out.println("Boat speed is: " + boat.boatSpeed() + " knots");
        System.out.println("Bike speed is: " + bike.bikeSpeed() + " m/s");

    }
}
