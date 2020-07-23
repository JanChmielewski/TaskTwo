public class Bike extends Vehicle {


    public Bike(double speed) {
        super(speed);
    }

    public void bikeSpeed() {
        System.out.println("Bike speed is: " + speed/3.6 + " m/s");
    }
}
